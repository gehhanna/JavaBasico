package vector;

public class VectorSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variaveis
				
		String s = "potato apple lemon orange";
		
		// Split e a func�o para cortar as palavras que est�o espa�adas e colocar elas em um vetor.
		
		String[] vect = s.split(" ");
		// aqui consta cada posi�ao do vetor que parti de 0 1 2 3 ...
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
	}

}
