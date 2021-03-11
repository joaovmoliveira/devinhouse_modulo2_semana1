
public class Conta {
	Cliente titular = new Cliente();
	double saldo;
	
	Conta() {
		
	}
	
	Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		this.titular.nome = nomeTitular;
		this.titular.sobrenome = sobrenomeTitular;
		this.titular.cpf = cpfTitular;
	}
	
	Conta(String nomeTitular, String sobrenomeTitular, 
			String cpfTitular, double saldoInicial) {
		this(nomeTitular, sobrenomeTitular, cpfTitular);
		this.saldo = saldoInicial;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	
}
