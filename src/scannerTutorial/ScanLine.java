package scannerTutorial;
import java.util.Locale;  // import do locale.
import java.util.Scanner; // import do Scanner.

public class ScanLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Locale para setar a localiza��o do teclado neste caso substitui a v�rgula por ponto.
		Locale.setDefault(Locale.US);
		// Scanner para ler a entrada de dados.
		Scanner sc = new Scanner(System.in);
		
		// Declara��o das vari�veis.
		int x;
		String s1,s2,s3;
		// NextLine e usado para ler toda uma linha e aqui atribuimos a vari�vel a cada line.
		
		
		x = sc.nextInt();
		// Se utilizamos outro termo que n�o seja o nextLine antes exemplo nextInt, precisamos criar um nextLine a mais para consumir
		// a quebra de linha.
		sc.nextLine(); // nextLine extra para consumir a quebra de linha.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		// Impress�o dos Dados.
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		// Fechamento do scanner.
		sc.close();
		
	}
	
	

}
