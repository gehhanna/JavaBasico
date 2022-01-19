package sintaxeCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeCumulativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Locale para definir a região do teclado como us para substituir virgula por ponto.
		Locale.setDefault(Locale.US);
		// Entrada de dados.
		Scanner sc = new Scanner (System.in);
		// Variáveis
		int minutos;
		double conta = 50.0;
		
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			
			// += e uma variável cumulativa para simplificar em vez de colocar conta = conta + ... colocamos += ou *= , /= , -= .  
			conta += (minutos - 100) * 2.0;
			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n" , conta);
		
		sc.close();
		
	}

}
