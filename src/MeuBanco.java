
public class MeuBanco {

	public static void main(String[] args) {
		/*
		 * String a = "string a"; String b = a; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 * 
		 * b = "string b"; System.out.println("valor de a: " + a);
		 * System.out.println("valor de b: " + b);
		 */

		Conta c1 = new Conta("João", "Oliveira", "11122233344");
		c1 = new Conta(100);
		c1.titular.nome = "João Victor";
		c1.titular.sobrenome = "Mendes de Oliveira";
		c1.titular.cpf = "111.222.333-44";
		System.out.printf("Saldo de c1 é: %.2f%n", c1.saldo);

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
