package ifElse;

public class IfElse {
	
	public static void main(String[] args) {
	
	
	
	// Vari�veis.
		
	double preco =  15.5;
	double desconto;
	
	// Caso de if e else b�sico, para saber o valor de  um desconto.
	// se " if " o pre�o for menor que 20 ent�o desconto * 0.1 sen�o "else" desconto * 0.05.
	if(preco<20.0) {
		
		desconto = preco *0.1;
		
	}
		else {
			
			desconto = preco * 0.05;
		}
			System.out.println(desconto);
	
	}
	
}


