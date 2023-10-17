import java.util.Locale;
import java.util.Scanner;

public class ProblemaConsumo {

	public static void main(String[] args) {
		
		/*
		  Fazer um programa para ler a distância total (em km) percorrida 
		  por um carro, bem como o total de combustível gasto por este carro
		  ao percorrer tal distância. Seu programa deve mostrar o consumo
		  médio do carro, com três casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		int distanciaPercorrida = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		double combustivelGasto = sc.nextDouble();
		
		if (combustivelGasto == 0) 
			System.out.println("Não informado combustível. Divisão por zero...");
		else
			System.out.printf("Consumo médio: %.3f Km/l", distanciaPercorrida / combustivelGasto);
		
		sc.close();
		
	}
	
}