import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {

	/*
	 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois
	 * mostrar o valor da área do círculo com três casas decimais. A fórmula da área
	 * do círculo é a seguinte: area = PI * r2. Você pode usar o valor de PI
	 * fornecido pela biblioteca da sua linguagem de programação, ou então, se
	 * preferir, use diretamente o valor 3.14159.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();

		sc.close();

		double pi = 3.14159;

		System.out.printf("ÁREA = %.3f", pi * Math.pow(raio, 2.0));

	}

}