
public class Main {

	public static void main(String[] args) {
		Cliente Kalebe = new Cliente();
		Kalebe.setNome("Kalebe");
		
		Conta corrente = new ContaCorrente(Kalebe);
		Conta poupanca = new ContaPoupanca(Kalebe);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
