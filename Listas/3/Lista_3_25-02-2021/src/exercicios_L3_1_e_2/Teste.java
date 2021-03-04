package exercicios_L3_1_e_2;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Exercicio_L3_2_PILHA exercicio_L3_2_PILHA = new Exercicio_L3_2_PILHA();
		Exercicio_L3_1_FILA exercicio_L3_1_FILA = new Exercicio_L3_1_FILA();
		
		int opcao = 0;
		int numero;
		
		while (opcao != 7) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite a opção desejada: \n"
					+ "1 - Adicionar na Pilha\n"
					+ "2 - Remover na Pilha (e adicionar na Fila)\n"
					+ "3 - Exibir Pilha\n"
					+ "4 - Adicionar na Fila\n"
					+ "5 - Remover na Fila (e adicionar na Pilha)\n"
					+ "6 - Exibir Fila\n"
					+ "7 - Finalizar Programa!"
					));
			
			switch (opcao) {

			case 1:
				exercicio_L3_2_PILHA.adicionaPilha(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para ser adicionado a Pilha: ")));
				break;

			case 2:
				numero = exercicio_L3_2_PILHA.removePilha();
				exercicio_L3_1_FILA.adicionaFila(numero);
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Pilha " + exercicio_L3_2_PILHA.exibePilha());
				break;				

			case 4:
				exercicio_L3_1_FILA.adicionaFila(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para ser adicionado a Fila: ")));
				break;				

			case 5:
				numero = exercicio_L3_1_FILA.removeFila();
				exercicio_L3_2_PILHA.adicionaPilha(numero);
				break;

			case 6:
				JOptionPane.showMessageDialog(null, "Fila " + exercicio_L3_1_FILA.exibeFila());
				break;

			case 7:
				JOptionPane.showMessageDialog(null, "Programa Finalizado com sucesso!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				break;
			
			}
		}
		
	}
	
}
