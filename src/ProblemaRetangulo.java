import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetangulo {

	public static void main(String[] args) {

		/*
		 	Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
		 	mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais,
		 	conforme exemplos.
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a base do retângulo: ");
		double base = sc.nextDouble();

		System.out.println("Informe a altura do retângulo: ");
		double altura = sc.nextDouble();

		System.out.printf("Área = %.4f%n", base * altura);
		System.out.printf("Perímetro = %.4f%n", base + base + altura + altura);
		System.out.printf("Diagonal = %.4f%n", Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)));

		sc.close();

	}

}