
public class Funcionario {
	String nome;
	String cpf;
	double salario;
	static double valeRefeicao = 550;
	
	public void aumentarSalario(double porcentagem) {
		salario *= porcentagem / 100 + 1;
	}
	
	public static void aumentarValeRefeicao(double porcentagem) {
		valeRefeicao *= porcentagem / 100 + 1;
	}
	
	public String retornarDados() {
		String aux = "";
		
		return aux;
	}
}
