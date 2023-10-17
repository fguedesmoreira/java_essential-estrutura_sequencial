import java.util.Scanner;

public class ProblemaSoma {

	public static void main(String[] args) {
		
		/*
		 Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar 
		 na tela o valor da soma destes números.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		System.out.printf("SOMA: %d", x + y);
		
		sc.close();
		
	}
	
}