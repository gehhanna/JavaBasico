package estruturaWhile;

import java.util.Scanner;

public class SenhaAcesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Iniciar a variável senha com sc.nextInt(); para ela começar a ser lida.
		int senha = sc.nextInt();
		// Se a senha digitada for diferente de " 2022 " o progama ira exibir acesso negado caso contrario acesso permitido!.
		while (senha != 2022) {
			 System.out.println("Acesso negado !");
			 senha = sc.nextInt();
		}
			System.out.println("Acesso permitido!");
			// Fechamento do scanner.
			sc.close();
		}
	
	}


