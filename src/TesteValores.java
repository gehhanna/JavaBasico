
public class TesteValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exemplo básico de multiplicação.
		int x ;
		double y;
		
		x= 5;
		y= 2 * x;
		
		System.out.println(x);
		System.out.println(y);

		// calculo da área do trapézio.
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B)/2.0*h;
		
		System.out.println(area);
		
		// resultado divisão com double.
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		// casting usando o double pra ficar 2.5 em vez de 2 como são a e c são números inteiros.
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
	}

}
