package exercicioEstSequen;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soma de dois n�meros inteiros.
		// V�riaveis
		
		int num1,num2,soma;
		
		// Scanner a sa�da de dados.
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		sc.close();
		
		// Print dos dados.
		System.out.println("Soma de dois valores");
		System.out.println("N�mero 1�: " + num1);
		System.out.println("N�mero 2�: " + num2);
		System.out.println("Valor da soma = " + soma);
		

	}

}
