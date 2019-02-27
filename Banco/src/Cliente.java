public class Cliente {
	String nome;
	String cpf;
	Conta conta = new Conta();
	cartaoDeCredito cartao = new cartaoDeCredito();
	
	public String retornarDados() {
		String aux = "";
		aux += "Nome -> " + nome + "\n";
		aux += "CPF -> " + cpf + "\n";
		aux += cartao.retornarDados();
		aux += conta.retornarDados();
		return aux;
	}
}
