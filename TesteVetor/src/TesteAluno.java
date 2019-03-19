import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno[] aluno = new Aluno[5];
		Scanner t = new Scanner(System.in);
		int rm;
		String nome;
		
		//input
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Informe o nome do aluno -> ");
			nome = t.nextLine();
			System.out.println("Informe o RM -> ");
			rm = t.nextInt();
			aluno[i] = new Aluno(rm, nome);
			t.nextLine();
		}
		
		//output
		for (Aluno a : aluno) {
			System.out.println(a.get());
		}
		
		
		
		t.close();

	}

}
