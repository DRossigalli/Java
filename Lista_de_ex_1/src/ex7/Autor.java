package ex7;

public class Autor {
	String nome, cidade;
	
	public String retornarDados() {
		String aux = "";
		aux += "Nome -> " + nome + "\n";
		aux += "Cidade -> " + cidade + "\n";
		return aux;
	}
}
