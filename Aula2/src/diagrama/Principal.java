package diagrama;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Professor professor = new Professor();
		
		System.out.println("Qual o nome?");
		professor.nome = t.nextLine();
		
		System.out.println("Qual a titulação?");
		professor.titulacao = t.nextLine();
		
		System.out.println("Qual o valor da aula?");
		professor.valorAula = t.nextDouble();
		
		System.out.println("Quantas aulas foram dadas?");
		professor.totalAula = t.nextInt();
		
		professor.ajustarValorAula(60);
		
	}

}
