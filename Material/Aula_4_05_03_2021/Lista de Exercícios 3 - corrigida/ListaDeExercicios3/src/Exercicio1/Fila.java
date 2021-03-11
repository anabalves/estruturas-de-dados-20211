package Exercicio1;

import java.util.Random;

public class Fila {                  
	private int dados[];                  
	private int tamanho;                 

	public Fila(){                       
		Random gerador = new Random();
		dados = new int[gerador.nextInt(30) + 1];
		tamanho=0;                            
	}

	public void Enqueue(int e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}




	public int Dequeue(){
		int retorno = 0;
		int i;
		if (tamanho>=1){                              
			retorno=dados[0];
			for (i=1;i<tamanho;i++){                      
				dados[i-1]=dados[i];                          
			}
			tamanho--;                                   
		}
		return retorno;
	}

	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i];
		}
		return aux;
	}
}
