package ex7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		System.out.println("Titulo do primeiro livro");
		l1.titulo = t.nextLine();
		
		System.out.println("Gênero do primeiro livro");
		l1.genero = t.nextLine();
		
		System.out.println("Nome e cidade do autor do primeiro livro");
		l1.autor.nome = t.nextLine();
		l1.autor.cidade = t.nextLine();
		
		System.out.println("Titulo do segundo livro");
		l2.titulo = t.nextLine();
		
		System.out.println("Gênero do segundo livro");
		l2.genero = t.nextLine();
		
		System.out.println("Nome e cidade do autor do segundo livro");
		l2.autor.nome = t.nextLine();
		l2.autor.cidade = t.nextLine();
		
		System.out.println(l1.retornarDados());
		System.out.println(l2.retornarDados());
		
		t.close();
	}

}
