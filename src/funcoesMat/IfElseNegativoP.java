package funcoesMat;

// tem um atalho ctrl+shift o para exportar o scanner.
import java.util.Scanner;

public class IfElseNegativoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner para entrada de dados do teclado.
		Scanner sc = new Scanner(System.in);

		int numero;
		// Mostrar a mensagem de digite seu n�mero
		System.out.println("Digite seu n�mero");
		// Scanner para atribuir a entrada de dados de inteiro a vari�vel numero.
		numero = sc.nextInt();

		// Se o numero digitado for menor que 0 sera negativo exemplo -10. sen�o sera
		// positivo.
		if (numero < 0) {
			System.out.println("Seu n�mero e negativo");
		} else {
			System.out.println("Seu n�mero e positivo");

			sc.close();
		}

	}

}
