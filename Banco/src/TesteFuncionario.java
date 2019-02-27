
public class TesteFuncionario {
	public static void main(String[] args) {
		
		System.out.println(Funcionario.valeRefeicao);
		Funcionario.aumentarValeRefeicao(10);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		System.out.println(f1.valeRefeicao);
		f2.valeRefeicao = 5000;
		
		System.out.println(f1.valeRefeicao);
		System.out.println(f2.valeRefeicao);
	}
}
