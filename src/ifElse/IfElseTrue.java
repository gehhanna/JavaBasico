package ifElse;

import java.util.Scanner;

public class IfElseTrue {

	public static void main(String[] args) {

		int hora;

		// ctrl+shift + o para importar o java.util.Scanner;
		// Scanner para entrada de dados.
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		// Se o valor da hora for menor que 12 então exibira a mensagem de bom dia se
		// não exibira boa tarde.
		
	// Se a hora for menor que 12 então bom dia.
		if (hora < 12) {
			System.out.println("Bom dia");
	// Senao se a hora for menor que 18 então boa tarde
		} else if (hora < 18) {
			System.out.println("Boa tarde");
	// Senao boa noite.
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}
}
