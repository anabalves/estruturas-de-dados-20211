package exercicios_livro_3_e_4;

import javax.swing.JOptionPane;

public class TesteLivros {
	
	public static void main(String[] args) {
		Exercicio_L3_3_Pilha_Livros exercicio_L3_3_Pilha_Livros = new Exercicio_L3_3_Pilha_Livros(5);
		Exercicio_L3_4_Fila_Livros exercicio_L3_4_Fila_Livros = new Exercicio_L3_4_Fila_Livros(5);
	
		int opcao = 0;
		String tituloExemplar;
		int quantidadeExemplares;
		
		while (opcao != 7) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite a opção desejada: \n"
					+ "1 - Adicionar Livro na Pilha\n"
					+ "2 - Remover Livro na Pilha\n"
					+ "3 - Exibir Livros da Pilha\n"
					+ "4 - Adicionar Livro na Fila\n"
					+ "5 - Remover Livro na Fila\n"
					+ "6 - Exibir Livros da Fila\n"
					+ "7 - Finalizar Programa!"
					));
			
			switch (opcao) {

			case 1:
				tituloExemplar = JOptionPane.showInputDialog("Digite o título do livro: ");
				quantidadeExemplares = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro: "));
				exercicio_L3_3_Pilha_Livros.adicionaLivroPilha(new Livro(tituloExemplar, quantidadeExemplares));
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "O livro removido foi:\n" + exercicio_L3_3_Pilha_Livros.removeLivroPilha());
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Pilha - Livros: " + exercicio_L3_3_Pilha_Livros.exibeLivrosPilha());
				break;				

			case 4:
				tituloExemplar = JOptionPane.showInputDialog("Digite o título do livro: ");
				quantidadeExemplares = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
				exercicio_L3_4_Fila_Livros.adicionaLivroFila(new Livro(tituloExemplar, quantidadeExemplares));
				break;				

			case 5:
				JOptionPane.showMessageDialog(null, "O livro removido foi:\n" + exercicio_L3_4_Fila_Livros.removeLivroFila());
				break;

			case 6:
				JOptionPane.showMessageDialog(null, "Fila - Livros: " + exercicio_L3_4_Fila_Livros.exibeLivrosFila());
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
