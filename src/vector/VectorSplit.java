package vector;

public class VectorSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variaveis
				
		String s = "potato apple lemon orange";
		
		// Split e a funcão para cortar as palavras que estão espaçadas e colocar elas em um vetor.
		
		String[] vect = s.split(" ");
		// aqui consta cada posiçao do vetor que parti de 0 1 2 3 ...
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
	}

}
