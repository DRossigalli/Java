package ex7;

public class Livro {
	String titulo, genero;
	Autor autor = new Autor();
	
	public String retornarDados() {
		String aux = "";
		aux += "Titulo -> " + titulo + "\n";
		aux += "G�nero -> " + genero + "\n";
		aux+= autor.retornarDados();
		return aux;
	}
}
