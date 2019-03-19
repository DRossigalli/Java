package ex2;

public class Ponto {
	int x;
	int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;	
	}
	public Ponto() {
		this(0, 0);
	}
	public String coord() {
		String aux = "";
		aux += "(" + x + "," + y + ")";
		return aux;
	}
	public float dist(Ponto B) {
		int x1 = this.x;
		int x2 = B.x;
		int y1 = this.y;
		int y2 = B.y;
		
		return (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
}
