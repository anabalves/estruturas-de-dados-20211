package Exercicio4;

import javax.swing.JOptionPane;

public class Fila  {
	private Livro dados[];
	private int tamanho;

	public Fila(int capacidade){
		dados= new Livro[capacidade];
		tamanho=0;
	}

	public void enqueue(Livro e){
		if (tamanho<dados.length){
			dados[tamanho]=e;
			tamanho++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Fila cheia");
		}
	}

	public Livro dequeue(){
		Livro r=null;
		if (tamanho>=1){
			r=dados[0];
			for (int i=0;i<tamanho-1;i++){
				dados[i]=dados[i+1];
			}
						
			tamanho--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Fila vázia");
		}
		return r;
	}
	
	public Livro retornar() {
		return dados[0];
	}
	
	public String bubbleSort() {
		for (int i = 0; i < tamanho; i++) {
			for (int j = i + 1; j < tamanho; j++) {
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
		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}
}
