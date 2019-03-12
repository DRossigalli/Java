
public class Bola {
	String cor;
	double raio;
	
	public Bola(String cor, double raio) {
		this.cor = cor;
		this.raio = raio;
	}
	
	public Bola() {
		this(null, 0);
	}
	
	public Bola(String cor) {
		this.cor = cor;
	}
	
	public Bola maiorBola(Bola b2, Bola b3) {
		Bola maior = this;
		if (b2.raio > b3.raio && b2.raio > maior.raio) {
			maior = b2;
		} else if (b3.raio > maior.raio) {
			maior = b3;
		}
		
		return maior;
	}
	
	//codificação do metodo para retornar dados
	public String retornarDados() {
		return cor + " " + raio;
	}
}
