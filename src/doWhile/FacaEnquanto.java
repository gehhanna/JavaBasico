package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Locale para setar a localidade do teclado.
		Locale.setDefault(Locale.US);
		// Scanner para entrada de dados no teclado.
		Scanner sc = new Scanner(System.in);
		
		char resp;
		// Faça
			do {

			// Sysout para gerar os dados na tela.
			System.out.println("Digite a temperatura em Celsius: ");
			// variáveis.
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit:  %.2f%n", F);
			System.out.println("Deseja repetir ? s/n" );
			// entrada de dados de tipo Char que e somente um caracter.
			resp = sc.next().charAt(0);
			
			// enquanto resp for diferente de n.
			
			} while (resp != 'n');			
			
			// fechamento do scanner.
			sc.close();
	}
}
