package br.com.devinhouse.banco.models;


public class Conta {
	private static int totalDeContas;
	
	private Cliente titular;
	private double saldo;
	private double limite = -200.0;
	private boolean ativa;
	
	
	public Conta() {
		Conta.totalDeContas++;	
	}
	
	public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		this();
		this.titular = new Cliente(nomeTitular, sobrenomeTitular, cpfTitular);
	}
	
	public Conta(String nomeTitular, String sobrenomeTitular, 
			String cpfTitular, double saldoInicial) {
		this(nomeTitular, sobrenomeTitular, cpfTitular);
		this.saldo = saldoInicial;
	}
	
	
	
	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		this.saldo += valor;
		return true;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo - valor >= this.limite) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean isAtiva() {
		return this.ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	
}
