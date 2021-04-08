/*2. Implemente uma Lista de temperaturas em alocação dinâmica
  com todas as operações 
*/

package Exercicio2;
/**
 *
 * @author Fabio
 */
import javax.swing.JOptionPane;
public class TesteDasClasses {
	public static void main(String[]args){
		ListaLigada l=new ListaLigada();
		int op=0,pos=0; 
		double dado = 0;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("Lista de Temperaturas\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona Posição\n4-Remove Final\n5-Remove Início\n6-Remove Posição\n7-Exibir\n99-Sair"));
			switch(op){
			case 1:
				dado=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
				l.AdicionaFinal(dado);
				break;
			case 2:
				dado=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
				l.AdicionaInicio(dado);
				break;
			case 3:
				dado=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				l.escolhePosicao(dado, pos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:"+l.RemoveFinal());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:"+l.RemoveInicio());
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				JOptionPane.showMessageDialog(null, "O elemento removido foi:"+l.escolheRemove(pos));
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Lista:"+l.percorre());
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Valor inválido");
			}
		}

	}
}
