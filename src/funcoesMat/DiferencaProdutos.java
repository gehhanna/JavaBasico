package funcoesMat;
import java.util.Scanner;
public class DiferencaProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vari�veis
		int A,B,C,D,diferenca;
	 
		// Fun��o scanner para entrada de dados.
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

	diferenca = (A*B - C*D);	
	
		// usando o println ou printline \n para quebra de linha.
		System.out.println("Diferen�a: \n " + diferenca );
		
		sc.close();

	}
	
		
		
}
