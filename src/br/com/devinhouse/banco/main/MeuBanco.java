package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.models.Conta;
import br.com.devinhouse.banco.models.Cliente;

public class MeuBanco {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Jo�o", "Oliveira", "1");
		System.out.println("Total de contas ap�s c1: " + c1.getSaldo());
		
		
		Conta c2 = new Conta();
		System.out.println("Total de contas ap�s c2: " + Conta.getTotalDeContas());
		
		/*
		 * String a = "string a"; String b = a; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 * 
		 * b = "string b"; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 */

		
		

		/*
		 * Conta c2 = new Conta(); c2.nomeTitular = "Jo�o"; c2.saldo = 10;
		 * 
		 * c1.transferir(c2, 5);
		 * 
		 * System.out.printf("Saldo de c1 �: %.2f%n", c1.saldo);
		 * System.out.printf("Saldo de c2 �: %.2f", c2.saldo);
		 */

	}

}
