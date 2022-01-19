package estruturaWhile;

import java.util.Scanner;

public class EnquantoEstrutura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Variáveis.
		int x = sc.nextInt();
		int soma = 0;
		// enquanto x for diferente != de 0 ele repete a ação.
		while (x != 0) {
			// soma recebe ela mesmo + o valor de x.
			soma += x;
			// entrada do valor de x.
			x = sc.nextInt();

		}

		System.out.println("Valor da soma : " + soma);
		sc.close();

	}
}
