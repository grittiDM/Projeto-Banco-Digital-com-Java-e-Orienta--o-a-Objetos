package banco;

public class Main {

	public static void main(String[] args) {

		Cliente murilo = new Cliente();
		murilo.setNome("Murilo Gritti");
        murilo.setCpf(123456789);
        murilo.setRg(987654321);
        murilo.setTelefone(123456789);
		
		Conta cc = new ContaCorrente(murilo);
		Conta poupanca = new ContaPoupanca(murilo);

		cc.depositar(888.51);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}