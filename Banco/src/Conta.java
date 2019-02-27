public class Conta {
	int numero;
	double saldo;
	double limite;
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public String gerarExtrato() {
		return "Extrato padrão";
	}
	
	public String gerarExtrato(int dias) {
		return "Extrato de " + dias + "dias";
	}
	
	public void transferir(Conta destino, float valor) {
		destino.depositar(valor);
		sacar(valor);
	}
	
	public String retornarDados() {
		String aux = "";
		aux += "Número da conta -> " + numero + "\n";
		aux += "Saldo -> R$" + saldo + "\n";
		aux += "Limite ->" + limite + "\n";
		return aux;
	}
}
