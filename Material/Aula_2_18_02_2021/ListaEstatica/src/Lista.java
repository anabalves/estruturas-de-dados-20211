
public class Lista {                  
	private int dados[];                  
	private int tamanho;                 

	public Lista(){                       
		dados=new int [5];                    
		tamanho=0;                            
	}

	public void AdicionaFinal(int e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}

	public void AdicionaInicio(int e){   
		if (tamanho<dados.length){           
			for (int i=tamanho;i>0;i--){         
				dados[i]=dados[i-1];                 
			}
			dados[0]=e;                          
			tamanho++;                           
		}
		else{
			System.out.println("Erro, lista cheia");        
		}
	}

	public void  AdicionaQualquerPosicao(int e, int pos){
		int i;
		if ((tamanho<dados.length)&&(pos<tamanho+1)&&(pos>=0)){


			for (i=tamanho;i!=pos;i--){                     
				if (i!=0){                                      
					dados[i]=dados[i-1];                            
				}
			}
			dados[i]=e;                                     
			tamanho++;                                      
		}
	}

	public int RemoveFinal(){
		int retorno = 0;
		int i;
		if (tamanho>=1){                               
			retorno=dados[tamanho-1];
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1)                             
					tamanho--;                                    
			}
		}
		return retorno;
	}

	public int RemoveInicio(){
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

	public int RemoveQualquerPosicao(int pos){
		int i,retorno=0;                                         

		if ((pos<tamanho)&&(pos>=0)&&(tamanho>=1)){
			retorno=dados[pos];

			for (i=pos;i<tamanho-1;i++){                 
				dados[i]=dados[i+1];                         
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

