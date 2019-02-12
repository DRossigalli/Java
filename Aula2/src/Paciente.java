public class Paciente {
	String nome;
	int idade;
	
	public int frequenciaMaxima() {
		return 220-idade;
	}
	
	public double[] frequenciaAlvo() {
		double[] f = new double[2];
		f[0] = frequenciaMaxima() * 0.5;
		f[1] = frequenciaMaxima() * 0.85;
		
		return f;
	}
	
}
