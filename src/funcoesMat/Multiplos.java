package funcoesMat;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scanner para entrada de dados no teclado.
		Scanner sc = new Scanner(System.in);
// Vari�veis.		
		int A, B;

// Sysout para imprimir na tela o texto.
		System.out.println("Digite os n�meros");
// atribui��o de A e B na entrada de n�meros inteiros.		
		A = sc.nextInt();
		B = sc.nextInt();

// Se A dividido por B restar 0 ent�o s�o multiplos ou B % A sen�o n�o sao multiplos.		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o s�o Multiplos");

			sc.close();

		}
	}

}
