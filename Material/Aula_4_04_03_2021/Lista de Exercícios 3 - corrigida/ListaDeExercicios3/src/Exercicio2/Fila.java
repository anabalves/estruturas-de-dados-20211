package Exercicio2;

public class Fila {

	private int fila [];

	private int tamanho;

	public Fila(){
		fila = new int [10];
		tamanho = 0;
	}

	public boolean VerifVazia(){
		if (tamanho==0){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean VerifCheia(){
		if (tamanho==fila.length){
			return true;
		}

		else{
			return false;
		}
	}

	public void Adicionar(int x){
		if(!VerifCheia()){
			fila[tamanho] = x;
			tamanho++;
		}
		else{
			System.out.println("A fila está cheia!");
		}
	}

		public String percorre(){                    
			String aux=" ";

			for (int i=0;i<tamanho;i++){
				aux=aux+"\n"+fila[i];
			}
			return aux;
		}
	

	public int retornar() {
		return fila[0];
	}

	public void Remover(){
		if(!VerifVazia()){
			System.out.println("Removendo o valor e adicionando ao topo da pilha= " + fila[0]);

			for(int i=0; i<=tamanho-2; i++){
				fila[i] = fila[i+1];
			}
			tamanho--;
		}

		else{
			System.out.println("A Fila está vazia!");
		}
	}
}