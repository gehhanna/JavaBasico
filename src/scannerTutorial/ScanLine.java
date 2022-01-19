package scannerTutorial;
import java.util.Locale;  // import do locale.
import java.util.Scanner; // import do Scanner.

public class ScanLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locale para setar a localização do teclado neste caso substitui a vírgula por ponto.
		Locale.setDefault(Locale.US);
		// Scanner para ler a entrada de dados.
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis.
		int x;
		String s1,s2,s3;
		// NextLine e usado para ler toda uma linha e aqui atribuimos a variável a cada line.
		
		
		x = sc.nextInt();
		// Se utilizamos outro termo que não seja o nextLine antes exemplo nextInt, precisamos criar um nextLine a mais para consumir
		// a quebra de linha.
		sc.nextLine(); // nextLine extra para consumir a quebra de linha.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		// Impressão dos Dados.
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		// Fechamento do scanner.
		sc.close();
		
	}
	
	

}
