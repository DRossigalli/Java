package ex5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadastro;
		Scanner t = new Scanner(System.in);
		Bicicleta bicicleta = new Bicicleta();
		
		System.out.println("Deseja cadastrar uma nova bicicleta? (s/n)");
		cadastro = t.next();
		
		while(cadastro.equalsIgnoreCase("s")) {
			System.out.println("OK! Vamos começar :)\n\n");
			t.nextLine();
			
			System.out.println("Qual a cor da bicicleta?");
			bicicleta.cor = t.nextLine();
			
			System.out.println("Qual o número de marchas?");
			bicicleta.marchas = t.nextInt();
			
			System.out.println("Qual o valor do aluguel?");
			bicicleta.valor = t.nextFloat();
			
			System.out.println(bicicleta.retornarDados());
						
			System.out.println("Deseja cadastrar outra?");
			cadastro = t.next();
		}
		
		if (cadastro.equalsIgnoreCase("n")) {
			System.out.println(bicicleta.retornarDados());
		}
		t.close();
	}
}
