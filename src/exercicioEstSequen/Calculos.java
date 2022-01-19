package exercicioEstSequen;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soma de dois números inteiros.
		// Váriaveis
		
		int num1,num2,soma;
		
		// Scanner a saída de dados.
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		sc.close();
		
		// Print dos dados.
		System.out.println("Soma de dois valores");
		System.out.println("Número 1°: " + num1);
		System.out.println("Número 2°: " + num2);
		System.out.println("Valor da soma = " + soma);
		

	}

}
