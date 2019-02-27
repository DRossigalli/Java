
public class Produto {
	String nome;
	float valor;
	
	public String retornarDados() {
		String aux = "";
		aux += "Nome -> " + nome + "\n";
		aux += "Valor -> R$" + valor + "\n";
		
		return aux;
	}
}
