import javax.swing.JOptionPane;


public class EstruturaDeDados {
Aluno a = null;


public EstruturaDeDados(){
	a = new Aluno();
	a.setMatricula("123");
	a.setNome("Fabio");
	exibirValores();
}

public void exibirValores(){
JOptionPane.showMessageDialog(null, a.getMatricula()+ 
		" "+a.getNome());

}

public EstruturaDeDados(String dados){

}

public EstruturaDeDados(String dados, int qtd){
	JOptionPane.showMessageDialog(null, "Oi");
}

public EstruturaDeDados(String dados, double valor){
	JOptionPane.showMessageDialog(null, "Olá");
}

public String obtemValor(){
return "";
}


public String obtemValor(int valor, String matricula){
	return "";
}

public String obtemValor(String matricula, int valor){
	return "";
}

public static void main(String []args){
	new EstruturaDeDados("",2);
	new EstruturaDeDados("",2.3);
	new EstruturaDeDados();
}

}

