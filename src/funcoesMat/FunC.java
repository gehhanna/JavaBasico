package funcoesMat;

import java.util.Locale;
import java.util.Scanner;

public class FunC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variáveis.
		String nome;
		int qtdHora;
		Double sal,valorHora;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		// Scanner para strings.
		System.out.println("Digite o nome do Funcionário");
		nome = sc.next();
		// Sc para números inteiros.
		System.out.println("Digite o valor da hora");
		valorHora = sc.nextDouble();
		System.out.println("Quantidade de horas");
		qtdHora = sc.nextInt();
		// Cálculo do salário.
		sal = valorHora*qtdHora;
		
		System.out.println("Nome: " + nome);
		System.out.println("Number: " + qtdHora);
		// Printf - print formatado, usando o %.2f para números de casas que quero que apareça e o %n para quebra de linha.
		System.out.printf("Salary and Name: $ %.2f%n" , sal );
		
		sc.close();
		
		

	}

}
