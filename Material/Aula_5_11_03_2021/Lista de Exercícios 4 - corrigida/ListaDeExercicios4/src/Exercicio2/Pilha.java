package Exercicio2;

import javax.swing.JOptionPane;

public class Pilha {
	private Produto dados[];
	private Produto newDados[];
	private int topo;
	private int newTopo;


	public Pilha(){
		dados = new Produto [10];
		topo = 0;
		
		newDados = new Produto [10];
		newTopo = 0;
	}
	
	public void push(Produto l){
		if (topo<dados.length){
			dados[topo]=l;
			topo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Cheia");
		}
	}	
	
	public void pushNewPilha(Produto l){
		if (newTopo<newDados.length){
			newDados[newTopo]=l;
			newTopo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Cheia");
		}
	}	


	public Produto pop(){
		Produto l=null;
		if (topo>0){
			l=dados[topo-1];
			topo--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Vázia");
		}
		return (l);
	}
	
	public boolean VerifVazia() {
		if(topo==0) {
			return true;
		}else {
			return false;
		}
	}

	public Produto retornar() {
		return dados[topo-1];
	}

	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<topo;i++){
			aux=aux+"\nID:"+dados[i].getId()+" Nome:"+dados[i].getNome()+""
					+ " Valor:"+dados[i].getValor()+" Quantidade:"+dados[i].getQuantidade();
		}
		return aux;
	}

	public String percorreNewPilha(){                    
		String aux=" ";

		for (int i=0;i<newTopo;i++){
			aux=aux+"\nID:"+newDados[i].getId()+" Nome:"+newDados[i].getNome()+""
					+ " Valor:"+newDados[i].getValor()+" Quantidade:"+newDados[i].getQuantidade();
		}
		return aux;
	}

	public int retornarOrdem(String nome){
		int ordem=-1;
		int qtd=0;
		for (int i=topo-1;i>=0;i--){
			qtd=qtd+1;
			if(nome.equalsIgnoreCase(dados[i].getNome())){
				ordem = qtd;
			}
		}
		return ordem;
	}


}