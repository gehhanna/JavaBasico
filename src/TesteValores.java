
public class TesteValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exemplo b�sico de multiplica��o.
		int x ;
		double y;
		
		x= 5;
		y= 2 * x;
		
		System.out.println(x);
		System.out.println(y);

		// calculo da �rea do trap�zio.
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B)/2.0*h;
		
		System.out.println(area);
		
		// resultado divis�o com double.
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		// casting usando o double pra ficar 2.5 em vez de 2 como s�o a e c s�o n�meros inteiros.
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
	}

}
