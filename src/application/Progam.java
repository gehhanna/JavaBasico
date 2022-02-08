package application;

import java.util.Locale;
import java.util.Scanner;

// Criar m�todo sem orienta��o objeto calcular �rea do tri�ngulo.


public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as dimens�es do triangulo X: ");
		
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as dimens�es do triangulo Y: ");
		
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p* (p - xA ) * (p - xB) *(p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p* (p - yA ) * (p - yB) *(p - yC));
		
		System.out.printf(" Area do Triangulo X : %.4f%n", areaX);
		System.out.printf(" Area do Triangulo Y : %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		}
		else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}

}
