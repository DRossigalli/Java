package ex5;

public class Bicicleta {
	String cor;
	int marchas;
	float valor;
	
	public String retornarDados() {
		String aux = "";
		aux += "Cor -> " + cor + "\n";
		aux += "Número de marchas -> " + marchas + "\n";
		aux += "Preço do aluguel -> " + valor + "\n";

		return aux;
	}
}
