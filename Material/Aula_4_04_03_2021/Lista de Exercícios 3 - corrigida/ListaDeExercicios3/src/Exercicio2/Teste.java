/*
 2)	Implemente uma Pilha para o problema apresentado no Exercício 1. 
 Implemente também uma classe de teste que possui uma instância da classe Fila 
 e uma instância da classe Pilha. Cada elemento removido da Fila deve ser adicionado
 no topo da Pilha. Cada elemento removido da Pilha deve ser adicionado no final da Fila.
*/

package Exercicio2;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();

		int opc=0;
		int x;
		String mostra;

		while(opc!=99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n 1- Inserir valor na fila \n 2- Remover valor da fila \n 3- Mostrar fila \n 4 - Inserir valor na pilha \n 5 - Remover valor da pilha \n 6 - Mostrar pilha \n 99- Sair"));

			switch(opc) {
			case 1:
				x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para adicionar a fila:"));
				fila.Adicionar(x);
				break;
			case 2:
				if(!fila.VerifVazia()) {
					pilha.Adicionar(fila.retornar());
					fila.Remover();
				}
				break;
			case 3:
				mostra = fila.percorre();
				JOptionPane.showMessageDialog(null,"A fila é: " + mostra);
				break;
			case 4:
				x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para adicionar a pilha:"));
				pilha.Adicionar(x);
				break;
			case 5:
				if(!pilha.VerifVazia()) {
					fila.Adicionar(pilha.retornar());
					pilha.Remover();
				}
				break;

			case 6:
				mostra = pilha.percorre();
				JOptionPane.showMessageDialog(null,"A pilha é: " + mostra);
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}
		}
	}
}