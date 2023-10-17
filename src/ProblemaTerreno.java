import java.util.Scanner;

public class ProblemaTerreno {

	/*
	  	Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
		casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
		o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
		duas casas decimais, conforme exemplo.
	  */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		System.out.printf("Área do terreno: %.2f%n m2", largura*comprimento);
		System.out.printf("Valor do terreno: %.2f%n", largura*comprimento*valorMetroQuadrado);
		
		sc.close();
		
	}
	
}