package exerciciosFor;

import java.util.Scanner;

public class NuInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// valor a ser digitado de quantos números irão ser analisados.
		int n = sc.nextInt();
		
		// variáveis.
		
		int in = 0;
		int out = 0;
		
		// para i recenbendo valor inicial 0, enquanto n for menor que o número digitado de vezes ele vai continuar contando.
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			// se o valor de x for maior ou igual a 10 e menor ou igual a 20 ele conta in ++ se não out ++.
			if (x >= 10 && x <=20) {
				in ++;
			}
			else{
				out ++;
			}
		}
			System.out.println(in + "in");
			System.out.println(out + "out");
			sc.close();
	}

}
