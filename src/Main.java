

public class Main {

	public static void main(String[] args) {
		Banco BB = new Banco();
		BB.setNome("Banco do Brasil");
		
		
		Cliente Kalebe = new Cliente();
		Kalebe.setNome("Kalebe");
		Kalebe.setCpf("123.456.978-00");


		Cliente Julia = new Cliente();
		Julia.setNome("Julia");
		Julia.setCpf("987.654.123-87");

		
		Conta corrente = new ContaCorrente(Kalebe);
		Conta poupanca = new ContaPoupanca(Kalebe);

		Conta poupanca1 = new ContaPoupanca(Julia);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);

		poupanca.transferir(100, poupanca1);


		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca1.imprimirExtrato();

	}

}
