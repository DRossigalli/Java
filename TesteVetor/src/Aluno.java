
public class Aluno {
	private int rm;
	private String nome;
	
	public Aluno(int rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}
	
	public String get() {
		return rm + " --- " + nome;
	}
}
