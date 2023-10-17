import java.util.Locale;
import java.util.Scanner;

public class ProblemaPagamento {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a)
		 * recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final,
		 * mostrar o valor do pagamento do funcionário com uma mensagem explicativa.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Valor por hora: R$ ");
		double valorHora = sc.nextDouble();

		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();

		System.out.printf("O pagamento para %s deve ser R$ %.2f", nome, horasTrabalhadas * valorHora);

		sc.close();

	}

}