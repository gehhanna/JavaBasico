package funcoesMat;

import java.util.Locale;
import java.util.Scanner;

public class FunC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vari�veis.
		String nome;
		int qtdHora;
		Double sal,valorHora;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		// Scanner para strings.
		System.out.println("Digite o nome do Funcion�rio");
		nome = sc.next();
		// Sc para n�meros inteiros.
		System.out.println("Digite o valor da hora");
		valorHora = sc.nextDouble();
		System.out.println("Quantidade de horas");
		qtdHora = sc.nextInt();
		// C�lculo do sal�rio.
		sal = valorHora*qtdHora;
		
		System.out.println("Nome: " + nome);
		System.out.println("Number: " + qtdHora);
		// Printf - print formatado, usando o %.2f para n�meros de casas que quero que apare�a e o %n para quebra de linha.
		System.out.printf("Salary and Name: $ %.2f%n" , sal );
		
		sc.close();
		
		

	}

}
