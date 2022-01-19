package funcoesMat;
// importação do Scanner ctrl+shift o atalho.
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Scanner para ler a entrada de dados do teclado.
		Scanner sc = new Scanner(System.in);
	// Variáveis.
		int numero;
	// Sysout para impressão do texto na tela.
		System.out.println("Digite o número");
	// atribuir a variável numero a entrada de dados.
		numero = sc.nextInt();
	// se o numero digitado dividido por 2 restar 0 então par senão impar.
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
			
			sc.close();
		}

	}

}
