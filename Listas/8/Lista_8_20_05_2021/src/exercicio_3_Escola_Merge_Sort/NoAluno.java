package exercicio_3_Escola_Merge_Sort;

public class NoAluno {
	
	private NoAluno anterior;
	private NoAluno proximo;
	private Aluno aluno;
	
	public NoAluno getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NoAluno anterior) {
		this.anterior = anterior;
	}
	
	public NoAluno getProximo() {
		return proximo;
	}
	
	public void setProximo(NoAluno proximo) {
		this.proximo = proximo;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}