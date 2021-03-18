/*2. Uma Loja Virtual necessita de uma aplicação que faça o gerenciamento de suas 
vendas por meio de uma Pilha que retire os produtos removidos que não existam em 
estoque. A classe Produtos possui os atributos ID, nome, valor e quantidade. */

package Exercicio2;

import javax.swing.JOptionPane;

public class TesteDasClasses {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		int opc=0;
		String mostra;
		Produto produto = null;

		while(opc!=99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir produto na pilha \n"
					+ "2- Remover produto da pilha \n"
					+ "3- Pesquisar ordem de espera na pilha \n"
					+ "4- Percorrer a Pilha \n"
					+ "5- Exibir Pilha de Produtos Removidos \n"
					+ "99- Sair"));

			switch(opc) {
			case 1:
				produto = new Produto();
				produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da produto")));
				produto.setNome(JOptionPane.showInputDialog("Informe o nome do produto"));
				produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
				produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto")));

				pilha.push(produto);
				break;
			case 2:
				if(!pilha.VerifVazia()) {
					pilha.pushNewPilha(pilha.retornar());
					pilha.pop();
				}
				break;
			case 3:
				produto = new Produto();
				produto.setNome(JOptionPane.showInputDialog("Informe o nome do produto que deseja localizar"));
				int ordem =pilha.retornarOrdem(produto.getNome());
				if(ordem==-1){
					JOptionPane.showMessageDialog(null, "Produto não encontrada");
				}
				else{
					JOptionPane.showMessageDialog(null, "A posição de produto na lista de espera da fila é:"+ordem);
				}
				break;
			case 4:
				mostra = pilha.percorre();
				JOptionPane.showMessageDialog(null,"A pilha é: " + mostra);
				break;
			case 5:
				mostra = pilha.percorreNewPilha();
				JOptionPane.showMessageDialog(null,"A pilha de produtos removidos é: " + mostra);
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