package funcoesMat;
import java.util.Scanner;
public class DiferencaProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variáveis
		int A,B,C,D,diferenca;
	 
		// Função scanner para entrada de dados.
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

	diferenca = (A*B - C*D);	
	
		// usando o println ou printline \n para quebra de linha.
		System.out.println("Diferença: \n " + diferenca );
		
		sc.close();

	}
	
		
		
}
