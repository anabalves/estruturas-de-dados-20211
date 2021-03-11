import javax.swing.JOptionPane;


public class Fila {
	private Livro dados[];
	private int tamanho;

	public Fila(int capacidade){
		dados= new Livro[capacidade];
		tamanho=0;
	}

	public void adiciona(Livro e){
		if (tamanho<dados.length){
			dados[tamanho]=e;
			tamanho++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Fila cheia");
		}
	}

	public Livro remove(){
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

	public String percorre(){
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}
}
