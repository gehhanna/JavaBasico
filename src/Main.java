import java.util.Locale;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define a entrada da aplicação.
		
		// int e para números inteiros. e = e a atribuição do valor a variável y.
		int y = 32;
		double x = 10.54758;
		String nome = "Maria";
		int idade = 25;
		double renda = 5000.24;
		
		// \n e a quebra de linha.
		
		
		System.out.println("Ola Mundo\n") ;
		System.out.println(y);
		// printf e o para imprimir com formatação. e o padrão e "%. e o valor de casas e a letra f
		System.out.printf("%.2f%n",x);
		// o locale e para definir o padrão da sua localidade de formatação.
		// no caso no brasil utilizasse virgula la na america utiliza virgula.
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		// para concatenar ou juntar os valores utilizasse o +.
		System.out.println("RESULTADO = " + x + " METROS");
		// Marcadores de variáveis " s e para String , d para inteiro, e f para double " .
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
	
}
