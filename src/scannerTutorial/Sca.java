package scannerTutorial;

import java.util.Locale;
import java.util.Scanner;

public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Locale serve para fazer com que o teclado migre de regi�o no caso aqui o virgula vira ponto pois e nativo Americano.
		
		Locale.setDefault(Locale.US);
		
		// o Scanner e para coletar os dados que e digitado no teclado e o sc.next(); coleta as informa��es e armazena na vari�vel.
		
		Scanner sc = new Scanner(System.in);
		
		// sc.nextInt(); para n�meros inteiros. | sc.next(); para textos em geral | � sc.nextDouble(); para n�meros flutuantes 2.5 exemplo. 
		
		Double x;
		
		x = sc.nextDouble();
		// %.2f e para mostrar o n�mero de casas exatas nesse caso 2 depois da v�rgula, e o %n e a quebra de linha.
		System.out.printf("voc� digitou: %.2f%n ",  x );
		
		sc.close();

	}

}
