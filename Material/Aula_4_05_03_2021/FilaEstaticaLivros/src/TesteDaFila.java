import javax.swing.*;
public class TesteDaFila {
	public static void main(String[]args){
		String titulo;
		int exemplares;
		Fila dados=new Fila(5);
		int op=0;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Adiciona\n2-Remove\n3-Exibir\n99-Sair"));
			switch(op){
			case 1:
				titulo=JOptionPane.showInputDialog("Informe o título do livro");
				exemplares=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de exemplares"));
				dados.adiciona(new Livro(titulo, exemplares));
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:\n"+dados.remove());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Fila:"+dados.percorre());
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





