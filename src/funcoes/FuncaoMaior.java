package funcoes;

import java.util.Scanner;

public class FuncaoMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner e para entrada de dados no teclado.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite tr�s n�meros");
		// entrada dos n�meros inteiros.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	/* aqui na fun��o chamamos a variavel max e damos os valores de cada atributo como todos sao inteiros. 
	e assim fazemos o se for maior ent�o o aux recebe o n�mero */ 
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		// retorna o valor.
		return aux;
	}
		// fun��o para imprimir os dados na tela.
		public static void showResult (int value) {
			System.out.println("Higher = " + value);
		}
	

}
