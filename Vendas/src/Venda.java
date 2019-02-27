
public class Venda {
	int quantidade;
	Produto produto = new Produto();
	
	public String retornarVendas() {
		String aux = "";
		aux += produto.retornarDados() + "\n" + quantidade;
		
		return aux;
	}
	
	public float retornarTotal() {
		return produto.valor * quantidade;
	}
}
