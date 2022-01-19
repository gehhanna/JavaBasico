package ifElse;

public class IfElse {
	
	public static void main(String[] args) {
	
	
	
	// Variáveis.
		
	double preco =  15.5;
	double desconto;
	
	// Caso de if e else básico, para saber o valor de  um desconto.
	// se " if " o preço for menor que 20 então desconto * 0.1 senão "else" desconto * 0.05.
	if(preco<20.0) {
		
		desconto = preco *0.1;
		
	}
		else {
			
			desconto = preco * 0.05;
		}
			System.out.println(desconto);
	
	}
	
}


