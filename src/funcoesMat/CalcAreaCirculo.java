package funcoesMat;

import java.util.Scanner;

public class CalcAreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Váriaveis
		
		double area, raio, pi = 314159;
		
		// Entrada de dados.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		
		raio = sc.nextDouble();
		
		area = pi*raio*raio;
		
		System.out.printf("Area = %.4f%n  ",  area );
		
		sc.close();
		
	}

}
