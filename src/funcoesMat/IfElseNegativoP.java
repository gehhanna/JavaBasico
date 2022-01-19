package funcoesMat;

// tem um atalho ctrl+shift o para exportar o scanner.
import java.util.Scanner;

public class IfElseNegativoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner para entrada de dados do teclado.
		Scanner sc = new Scanner(System.in);

		int numero;
		// Mostrar a mensagem de digite seu número
		System.out.println("Digite seu número");
		// Scanner para atribuir a entrada de dados de inteiro a variável numero.
		numero = sc.nextInt();

		// Se o numero digitado for menor que 0 sera negativo exemplo -10. senão sera
		// positivo.
		if (numero < 0) {
			System.out.println("Seu número e negativo");
		} else {
			System.out.println("Seu número e positivo");

			sc.close();
		}

	}

}
