package Exercicio5;

import javax.swing.JOptionPane;

import Exercicio4.Livro;

public class Pilha {
	private Livro dados[];
	private int topo;


	public Pilha(int n){
		dados=new Livro[n];
		topo=0;
	}

	public void push(Livro l){
		if (topo<dados.length){
			dados[topo]=l;
			topo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Cheia");
		}
	}

	public Livro pop(){
		Livro l=null;
		if (topo>0){
			l=dados[topo-1];
			topo--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Vázia");
		}
		return (l);
	}

		public String bubbleSort() {
			for (int i = 0; i < topo; i++) {
				for (int j = i + 1; j < topo; j++) {
					if (dados[i].compareTo(dados[j]) > 0) {
						Livro aux = dados[i];
						dados[i] = dados[j];
						dados[j] = aux;
					}				
				}
			}
 		 
       return percorre();
    }		


	public String percorre(){
		String aux=" ";
		for (int i=0;i<topo;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}

}