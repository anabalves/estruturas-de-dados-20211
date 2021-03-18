/*
    4)	A classe Livro possuí os seguintes atributos que são criados na classe
		concreta e acessados por meio dos métodos públicos da classe (getters e setters). 
		Dado o cenário implemente uma Fila 

 	Implementações adicionais
 	
 	Exemplo 1)	Considerando o cenário descrito no Exercício 5, implemente uma Pilha 
 	de  Livros que deverá conter cada elemento removido da Fila. 
 	Ou seja, os elementos removidos da Fila serão inseridos em uma Pilha. 

	Exemplo 2) Considerando o cenário do descrito no Exemplo 1 realize a 
	ordenação dos Livros pelo título e apresente os resultados em tela.
 */

package Exercicio4;

import javax.swing.JOptionPane;

import Exercicio5.Pilha;

public class TesteDasClasses {
	public static void main(String[]args){
		String titulo;
		int exemplares;
		Fila dadosFila=new Fila(10);
		Pilha dadosPilha = new Pilha(10);

		int op=0;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar\n2-Remover\n3-Ordenar Fila\n4-Ordenar Pilha\n5-Exibir Fila\n6-Exibir Pilha\n99-Sair"));
			switch(op){
			case 1:
				titulo=JOptionPane.showInputDialog("Informe o título do livro");
				exemplares=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de exemplares"));
				dadosFila.enqueue(new Livro(titulo, exemplares));
				break;
			case 2:
				Livro removido = dadosFila.dequeue();
				JOptionPane.showMessageDialog(null,"O elemento removido foi:\n"+removido);
				if(removido!=null){
					dadosPilha.push(removido);	
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Fila ordenada:"+dadosFila.bubbleSort());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Pilha ordenada:"+dadosPilha.bubbleSort());
			break;
			case 5:
				JOptionPane.showMessageDialog(null,"Fila:"+dadosFila.percorre());
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Pilha:"+dadosPilha.percorre());
			break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Valor inválido, digite novamente");
			}
		}
	}
}