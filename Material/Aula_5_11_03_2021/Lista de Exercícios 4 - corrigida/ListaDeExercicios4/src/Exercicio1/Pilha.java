package Exercicio1;

import javax.swing.JOptionPane;

public class Pilha {
	private Pessoa dados[];
	private int topo;


	public Pilha(){
		dados = new Pessoa [10];
		topo = 0;
	}

	public void push(Pessoa l){
		if (topo<dados.length){
			dados[topo]=l;
			topo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha Cheia");
		}
	}	

	public Pessoa pop(){
		Pessoa l=null;
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

	public Pessoa retornar() {
		return dados[topo-1];
	}

	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<topo;i++){
			aux=aux+"\nID:"+dados[i].getId()+" Nome:"+dados[i].getNome()+" RG:"+dados[i].getRg()+""
					+ " Telefone:"+dados[i].getTelefone()+" Data de nascimento:"+dados[i].getDataNascimento();
		}
		return aux;
	}


}