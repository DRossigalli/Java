import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Cliente cliente = new Cliente();
		double valor;
		
		System.out.print("Nome do cliente -> ");
		cliente.nome = t.nextLine();
		System.out.print("CPF do cliente -> ");
		cliente.cpf = t.next();
		System.out.print("Informe o saldo inicial -> ");
		cliente.conta.saldo = t.nextDouble();
		
		//saida de dados
		System.out.print(cliente.retornarDados());
		
		//depositar na conta
		System.out.print("Quanto deseja depositar? -> ");
		valor = t.nextDouble();
		cliente.conta.depositar(valor);
		
		//saida de dados
		System.out.println(cliente.retornarDados());
		
		System.out.print("Quanto deseja sacar? -> ");
		valor = t.nextDouble();
		cliente.conta.sacar(valor);
		
		//saida de dados
		System.out.println(cliente.retornarDados());
		
		//imprimir extrato padrão
		cliente.conta.gerarExtrato();
		
		//imprimir extrato de 120 dias
		cliente.conta.gerarExtrato(120);
		
		t.close();
	}
}
