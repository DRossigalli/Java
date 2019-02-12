package diagrama;

public class Professor {
	
	String nome;
	String titulacao;
	double valorAula;
	int totalAula;

	public double calcularSalario() {
		double salarioBase, horaAtividade, descansoSemanal;
		
		salarioBase = totalAula * 4.5 * valorAula;
		if (titulacao.equalsIgnoreCase("mestre")) {
			salarioBase *= 1.03;
		} else {
			salarioBase *= 1.085; 
		}
		
		//calculo da hora atividade
		horaAtividade = salarioBase * 0.05;
		
		//calculo do descanso semanal remunerador
		descansoSemanal = (salarioBase + horaAtividade) / 6;
		
		return salarioBase + horaAtividade + descansoSemanal;
	}
	
	public void ajustarValorAula(double porcentagem) {
		if (porcentagem > 100) {
			valorAula *= (porcentagem / 100 + 1);
		}
	}
	
	public String retornarDados() {
		String aux = "";
		aux += "Nome -> " + nome + "\n";
		aux += "Titulação ->" + titulacao + "\n";
		aux += "Salário -> R$" + calcularSalario();
		
		return aux;
	}

}
