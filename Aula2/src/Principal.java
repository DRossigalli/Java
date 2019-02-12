import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			Scanner t = new Scanner(System.in);
			
			Paciente paciente = new Paciente();
			System.out.println("Informe o nome do paciente: ");
			paciente.nome = t.nextLine();
			
			System.out.println("Informe a idade do paciente");
			paciente.idade = t.nextInt();
			
			System.out.println(paciente);
			System.out.println(paciente.nome);
			System.out.println(paciente.idade);
			System.out.println(paciente.frequenciaMaxima());
			double f[] = paciente.frequenciaAlvo();
			
			System.out.println("Minimo -> " + f[0]);
			System.out.println("Máximo ->" + f[1]);
			
			t.close();
	}

}
