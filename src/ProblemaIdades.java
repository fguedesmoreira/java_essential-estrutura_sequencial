import java.util.Locale;
import java.util.Scanner;

public class ProblemaIdades {

	public static void main(String[] args) {
		
		/*
		  Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
		  nomes e a idade média entre essas pessoas, com uma casa decimal.
		 */
		
		System.out.println("Dados da primeira pessoa:");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nomeP1 = sc.nextLine();
	
		System.out.print("Idade: ");
		int idadeP1 = sc.nextInt();
		
		System.out.println("\nDados da segunda pessoa:");
		sc.nextLine();
		
		System.out.print("Nome: ");
		String nomeP2 = sc.nextLine();
	
		System.out.print("Idade: ");
		int idadeP2 = sc.nextInt();
		
		sc.close();
		
		double mediaIdades = (double) (idadeP1 + idadeP2) / 2;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("\nA idade média de %s e %s é de %.1f anos.", nomeP1, nomeP2, mediaIdades);
		
	}
	
}