package funcoesMat;

import java.util.Locale;
import java.util.Scanner;

public class CalcPrecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A*C / 2;
		circulo = 3.14159 *C *C;
		trapezio = (A + B) / 2.0 *C;
		quadrado = B * B;
		retangulo = A * B;
			
		System.out.printf("Triangulo: %.3f%n" , triangulo);
		System.out.printf("circulo: %.3f%n" , circulo);
		System.out.printf("trapezio: %.3f%n" , trapezio);
		System.out.printf("quadrado: %.3f%n" , quadrado);
		System.out.printf("retangulo: %.3f%n" , retangulo);
		
		sc.close();
	}

}
