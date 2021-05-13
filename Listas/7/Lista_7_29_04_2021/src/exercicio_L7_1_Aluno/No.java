package exercicio_L7_1_Aluno;

public class No {

	public Aluno aluno;
	public No anterior;
	public No proximo;
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public No getAnterior() {
		return anterior;
	}
	
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
}