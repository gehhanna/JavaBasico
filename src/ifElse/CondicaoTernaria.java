package ifElse;



public class CondicaoTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// oque ocorre aqui e que em vez de criarmos varios if else.
		// com a condicional ternaria primeiro vem " ? " o verdadeiro e depois : o falso.
		
		double preco = 15.9;
		double desconto = (preco<20) ? preco * 0.1 : preco *0.05;
		
			System.out.println(desconto);

	}

}
