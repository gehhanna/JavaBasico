package estruturaWhile;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// Variáveis.
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
		int opcao = 0;

		while (opcao != 4) {

			System.out.println(" Digite o tipo de abastecimento: 1 alcool 2 diesel e 3 gasolina ");
			opcao = sc.nextInt();
			
			// Se opção for = 1 alcool recebe o valor de contador +1 e assim nas outras
			// opções do diesel e gasolina.
			if (opcao == 1) {
				alcool += 1;
			} else if (opcao == 2) {
				diesel += 1;

			} else if (opcao == 3) {
				gasolina += 1;

				// se o valor for maior que 4 a opção sera inválida.

			} else if (opcao > 4) {
				System.out.println("Opção inválida!");

			} else {

				System.out.println("Muito Obrigado!");
				System.out.println("Abastecimento com alcool : " + alcool);
				System.out.println("Abastecimento com diesel : " + diesel);
				System.out.println("Abastecimento com gasolina : " + gasolina);

				sc.close();
			}

		}

	}

}
