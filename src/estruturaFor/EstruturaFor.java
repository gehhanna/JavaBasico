package estruturaFor;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner para entrada de dados.
		Scanner sc = new Scanner(System.in);
		//Variáveis.
		
		int N = sc.nextInt();
		int soma = 0;
		// Declarar uma variável i iniciando com valor 0 e dado um valor para variável
		// e repetir ela enquanto o i for menor que a mesma. i=i+1 ou i++.
		for ( int i=0; i<N; i++ ) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
