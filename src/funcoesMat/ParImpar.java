package funcoesMat;
// importa��o do Scanner ctrl+shift o atalho.
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Scanner para ler a entrada de dados do teclado.
		Scanner sc = new Scanner(System.in);
	// Vari�veis.
		int numero;
	// Sysout para impress�o do texto na tela.
		System.out.println("Digite o n�mero");
	// atribuir a vari�vel numero a entrada de dados.
		numero = sc.nextInt();
	// se o numero digitado dividido por 2 restar 0 ent�o par sen�o impar.
		if (numero % 2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero impar");
			
			sc.close();
		}

	}

}
