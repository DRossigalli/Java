import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		int[] y = {1, 2, 3, 4, 5, 6};
		int[] x = new int[10];
		System.out.println(x);
		
		lerVetor(x);
		imprimir(x);
		int soma1 = somar(2, 5, 6, 7, 3, 5, 2, 6, 5, 2, 1);
		int soma2 = somar(2, 3, 5, 2, 6);
		System.out.println("Soma 1 = " + soma1);
		System.out.println("Soma 2 = " + soma2);
	}
	
	
	public static int somar(int...is) {
		int aux = 0;
		for(int i : is) {
			aux += i;
		}
		return aux;
	}


	private static void imprimir(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		
		for(int i : x) {
			System.out.print(i + "\t");
		}
	}


	public static void lerVetor(int[] x) {
		Random rand = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(1000);
		}
	}

}