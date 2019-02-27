public class TesteTransferencia {
	public static void main(String[] args) {

		Cliente cl1 = new Cliente();
		cl1.nome = "Diego";
		cl1.conta.saldo = 800;
		
		Cliente cl2 = new Cliente();
		cl2.nome = "Gab";
		cl2.conta.saldo = 200;
		
		//transferencia do cl1 para o cl2
		cl2.conta.transferir(cl1.conta, 50);
		
		//impressão das contas
		System.out.println(cl1.retornarDados());
		System.out.println(cl2.retornarDados());
	}

}
