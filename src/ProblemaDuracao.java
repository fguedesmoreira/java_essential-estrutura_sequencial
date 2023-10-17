import java.util.Scanner;

public class ProblemaDuracao {

	public static void main(String[] args) {
		
		System.out.print ("Digite a duração em segundos: ");
		
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		
		int segundos = 0;
		
		int horas = tempo / 3600;
		segundos = tempo - (horas * 3600);
		
		int minutos = segundos / 60;
		segundos = segundos - (minutos * 60);
		
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		
		sc.close();
		
	}
	
}