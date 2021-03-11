public class Livro {
	private String titulo;
	private int exemplares;

	public Livro(String titulo, int exemplares){
		this.titulo=titulo;
		this.exemplares=exemplares;
	}

	public String getTitulo(){
		return (titulo);
	}

	public int getExemplares(){
		return (exemplares);
	}

	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

	public void setExemplares(int exemplares){
		this.exemplares=exemplares;
	}

	public String toString(){
		String retorno="Título:"+this.titulo+",Exemplares:"+this.exemplares;
		return retorno;
	}
}
