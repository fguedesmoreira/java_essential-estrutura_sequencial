import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para calcular o troco no processo de pagamento de um
		 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
		 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
		 * pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
		 * mostrar o valor do troco a ser devolvido ao cliente.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Preço unitário do produto: R$ ");
		double precoUnitario = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();

		System.out.print("Dinheiro recebido: R$ ");
		double dinheiroRecebido = sc.nextDouble();

		System.out.printf("TROCO = R$ %.2f", dinheiroRecebido - quantidade * precoUnitario);

		sc.close();

	}

}