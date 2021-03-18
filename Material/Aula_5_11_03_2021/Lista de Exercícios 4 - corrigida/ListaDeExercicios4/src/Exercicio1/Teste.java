/*1. O Detram necessita de uma aplicação que faça o gerenciamento das pessoas 
que se cadastraram de maneira online para o exame final. 
Dado o cenário implemente uma Fila Estática de Pessoas contendo as propriedades ID, 
nome, RG, telefone e data de nascimento.
*/

package Exercicio1;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();

		int opc=0;
		String mostra;
		Pessoa pessoa = null;

		while(opc!=99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir pessoa na fila \n"
					+ "2- Remover pessoa da fila \n"
					+ "3- Pesquisar ordem de espera na fila \n"
					+ "4- Percorrer a fila \n"
					+ "5- Inserir pessoa na pilha \n"
					+ "6- Remover pessoa da pilha \n"
					+ "7- Mostrar pilha \n"
					+ "99- Sair"));

			switch(opc) {
			case 1:
				pessoa = new Pessoa();
				pessoa.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da pessoa")));
				pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa"));
				pessoa.setRg(JOptionPane.showInputDialog("Informe o RG da pessoa"));
				pessoa.setTelefone(JOptionPane.showInputDialog("Informe o telefone da pessoa"));
				pessoa.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento da pessoa"));
				fila.Adicionar(pessoa);
				break;
			case 2:
				if(!fila.VerifVazia()) {
					pilha.push(fila.retornar());
					fila.Remover();
				}
				break;
			case 3:
				pessoa = new Pessoa();
				pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa que deseja localizar"));
				int ordem =fila.retornarOrdem(pessoa.getNome());
				if(ordem==-1){
					JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
				}
				else{
					JOptionPane.showMessageDialog(null, "A posição de pessoa na lista de espera da fila é:"+ordem);
				}
				break;

			case 4:
				mostra = fila.percorre();
				JOptionPane.showMessageDialog(null,"A fila é: " + mostra);
				break;	
			case 5:
				pessoa = new Pessoa();
				pessoa.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da pessoa")));
				pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa"));
				pessoa.setRg(JOptionPane.showInputDialog("Informe o RG da pessoa"));
				pessoa.setTelefone(JOptionPane.showInputDialog("Informe o telefone da pessoa"));
				pessoa.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento da pessoa"));
				pilha.push(pessoa);
				break;
			case 6:
				if(!pilha.VerifVazia()) {
					fila.Adicionar(pilha.retornar());
					pilha.pop();
				}
				break;
			case 7:
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