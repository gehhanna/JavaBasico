package funcoesMat;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scanner para entrada de dados no teclado.
		Scanner sc = new Scanner(System.in);
// Variáveis.		
		int A, B;

// Sysout para imprimir na tela o texto.
		System.out.println("Digite os números");
// atribuição de A e B na entrada de números inteiros.		
		A = sc.nextInt();
		B = sc.nextInt();

// Se A dividido por B restar 0 então são multiplos ou B % A senão não sao multiplos.		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");

			sc.close();

		}
	}

}
