package ex5;

public class Bicicleta {
	String cor;
	int marchas;
	float valor;
	
	public String retornarDados() {
		String aux = "";
		aux += "Cor -> " + cor + "\n";
		aux += "N�mero de marchas -> " + marchas + "\n";
		aux += "Pre�o do aluguel -> " + valor + "\n";

		return aux;
	}
}
