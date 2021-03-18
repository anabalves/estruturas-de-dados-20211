package Exercicio2;

public class Pilha {

	private int pilha[];

	private int tamanho;

	public Pilha() {
		pilha = new int [10];
		tamanho = 0;
	}

	public boolean VerifVazia() {
		if(tamanho==0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean VerifCheia() {
		if(tamanho==pilha.length) {
			return true;
		}else {
			return false;
		}
	}

	public void Adicionar(int x) {
		if(!VerifCheia()) {
			pilha[tamanho] = x;
			tamanho++;
		}else {
			System.out.println("A pilha está cheia!");
		}
	}

	public int retornar() {
		return pilha[tamanho-1];
	}

	public void Remover() {
		if(!VerifVazia()) {
			System.out.println("Removendo o valor e adicionando ao fim da fila = " + pilha[tamanho-1]);
			tamanho--;

		}else {
			System.out.println("A pilha está vazia!");
		}
	}

	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+pilha[i];
		}
		return aux;
	}
}	