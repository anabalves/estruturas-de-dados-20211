package Exercicio1;

public class Fila {

	private Pessoa dados[];

	private int tamanho;

	public Fila(){
		dados = new Pessoa [10];
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
		if (tamanho==dados.length){
			return true;
		}

		else{
			return false;
		}
	}

	public void Adicionar(Pessoa x){
		if(!VerifCheia()){
			dados[tamanho] = x;
			tamanho++;
		}
		else{
			System.out.println("A fila está cheia!");
		}
	}

	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<tamanho;i++){
			aux=aux+"\nID:"+dados[i].getId()+" Nome:"+dados[i].getNome()+" RG:"+dados[i].getRg()+""
					+ " Telefone:"+dados[i].getTelefone()+" Data de nascimento:"+dados[i].getDataNascimento();
		}
		return aux;
	}


	public int retornarOrdem(String nome){
		int ordem=-1;
		for (int i=0;i<tamanho;i++){
			if(nome.equalsIgnoreCase(dados[i].getNome())){
				ordem = i+1;
			}
		}
		return ordem;
	}


	public Pessoa retornar() {
		return dados[0];
	}

	public void Remover(){
		if(!VerifVazia()){
			System.out.println("Removendo o valor e adicionando ao topo da pilha= " + dados[0].getNome());

			for(int i=0; i<=tamanho-2; i++){
				dados[i] = dados[i+1];
			}
			tamanho--;
		}

		else{
			System.out.println("A Fila está vazia!");
		}
	}
}