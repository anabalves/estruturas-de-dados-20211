/*
 1) Uma fila é um tipo especial de lista com política que restringe a
    manipulação dos elementos. A política da fila é First In First Out (FIFO),
    o primeiro elemento adicionado será removido primeiro.
    Implement	e uma classe denominada Fila com esta política.
*/

package Exercicio1;

import javax.swing.JOptionPane;

public class TesteFila {
	public static void main(String[]args){
		Fila filaExemplo=new Fila();                   
		int op=0,pos;
		int conteudo;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("Fila\n1-Adicionar\n2-Remover\n3-Mostra Elementos\n99-Sair"));

			switch(op){
			case 1:
				conteudo=Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
				filaExemplo.Enqueue(conteudo);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O elemento removido foi:"+filaExemplo.Dequeue());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Fila:"+filaExemplo.percorre());       
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
