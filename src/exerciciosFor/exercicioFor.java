package exerciciosFor;

import java.util.Scanner;

public class exercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner entrada de dados no teclado.
		Scanner sc = new Scanner(System.in);
		// Digitar o n�mero inteiro.
		int x = sc.nextInt();
		// Para i recebendo 1 enquanto o n�mero digitado for menor que i adiciona a contagem.
		for (int i=1; i<=x; i++) {
			// se i que e o n�mero digitado dividido por 2 for diferente de 0. ent�o printa o valor. e quebra uma linha
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
