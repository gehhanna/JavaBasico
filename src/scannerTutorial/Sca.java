package scannerTutorial;

import java.util.Locale;
import java.util.Scanner;

public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Locale serve para fazer com que o teclado migre de região no caso aqui o virgula vira ponto pois e nativo Americano.
		
		Locale.setDefault(Locale.US);
		
		// o Scanner e para coletar os dados que e digitado no teclado e o sc.next(); coleta as informações e armazena na variável.
		
		Scanner sc = new Scanner(System.in);
		
		// sc.nextInt(); para números inteiros. | sc.next(); para textos em geral | é sc.nextDouble(); para números flutuantes 2.5 exemplo. 
		
		Double x;
		
		x = sc.nextDouble();
		// %.2f e para mostrar o número de casas exatas nesse caso 2 depois da vírgula, e o %n e a quebra de linha.
		System.out.printf("você digitou: %.2f%n ",  x );
		
		sc.close();

	}

}
