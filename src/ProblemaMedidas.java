import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedidas {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e
		 * mostrar (imprimir os dados com quatro casas decimais): 
		 * a) a área do quadrado que tem lado A 
		 * b) a área do triângulo retângulo que base A e altura B 
		 * c) a área do trapézio que tem bases A e B, e altura C
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida A: ");
		double medidaA = sc.nextDouble();

		System.out.print("Digite a medida B: ");
		double medidaB = sc.nextDouble();

		System.out.print("Digite a medida C: ");
		double medidaC = sc.nextDouble();

		System.out.printf("\nA área do quadrado que tem lado A é %.4f metros quadrados.", medidaA * medidaA);
		System.out.printf("\nA área do triângulo retângulo que base A e altura B é %.4f metros quadrados.",
				(medidaA * medidaB) / 2);
	
		System.out.printf("\nA área do trapézio que tem bases A e B, e altura C é %.4f metros quadrados.",
				(medidaA + medidaB) * medidaC / 2);

		sc.close();

	}

}