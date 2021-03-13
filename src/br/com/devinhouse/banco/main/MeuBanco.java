package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.models.Conta;
import br.com.devinhouse.banco.models.Fatura;
import br.com.devinhouse.banco.models.Cliente;

public class MeuBanco {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura("123", "teste", -2, -10.0);
		fatura.setPreco(-1.0);
		fatura.setQuantidade(-5);
		System.out.printf("quantidade: %d%n", fatura.getQuantidade());
		System.out.printf("preco: %f%n", fatura.getPreco());
		System.out.printf("valor fatura: %f%n", fatura.getValorFatura());
		
		
		/*
		 * Conta c1 = new Conta("João", "Oliveira", "1"); c1.depositar(100);
		 * System.out.println("Saldo c1: " + c1.getSaldo());
		 * 
		 * 
		 * Conta c2 = new Conta("Emanuelle", "Figueiredo", "2");
		 * System.out.println("Total de contas após c2: " + Conta.getTotalDeContas());
		 * 
		 * c1.transferir(c2, 50);
		 * 
		 * System.out.println("Saldo de c2: " + c2.getSaldo());
		 * System.out.println("Saldo de c1: " + c1.getSaldo());
		 */
		
		/*
		 * String a = "string a"; String b = a; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 * 
		 * b = "string b"; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 */

		
		

		/*
		 * Conta c2 = new Conta(); c2.nomeTitular = "João"; c2.saldo = 10;
		 * 
		 * c1.transferir(c2, 5);
		 * 
		 * System.out.printf("Saldo de c1 é: %.2f%n", c1.saldo);
		 * System.out.printf("Saldo de c2 é: %.2f", c2.saldo);
		 */

	}

}
