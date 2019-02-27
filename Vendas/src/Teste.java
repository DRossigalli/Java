import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Venda venda = new Venda();
		
		System.out.println("Qual o nome do produto?");
		venda.produto.nome = t.nextLine();
		
		System.out.println("Qual o valor do produto?");
		venda.produto.valor = t.nextFloat();
		
		System.out.println("Qual a quantidade de produtos?");
		venda.quantidade = t.nextInt();
		
		System.out.println("Dados da venda -> \n" + venda.retornarVendas());
		System.out.println("Total da venda -> \n R$" + venda.retornarTotal());
		
		t.close();
	}

}
