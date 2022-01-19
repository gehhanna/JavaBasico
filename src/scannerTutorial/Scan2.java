package scannerTutorial;

import java.util.Locale;
import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Locale para transformar a vírgula em ponto por conta da localidade US.
		
		Locale.setDefault(Locale.US);
		
		int x;
		String y;
		Double z;
		
		Scanner sc = new Scanner(System.in);
		
		// Atribuimos o x y z a cada um dos seus tipos no caso z = inteiro , y String , e z double.
		x = sc.nextInt();
		y = sc.next();
		z = sc.nextDouble();
		
		// Print dos dados digitados no scan.
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
	}
	
	

}
