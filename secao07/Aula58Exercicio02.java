// Exerc�icio para fixa��o da fun��o split.

package secao07;

public class Aula58Exercicio02 {

	public static void main(String[] args) {

		String s = "potato apple lemon";

		// Neste caso estamos utilizando o espa�o em branco como separador.
		// A fun��o split vai transformar as palavras em vetores, utilizando o espa�o como separador.
		String[] vect = s.split(" ");

		//String original
		System.out.println(s);
		// Vetor na posi��o 0
		System.out.println(vect[0]);
		// Vetor na posi��o 1
		System.out.println(vect[1]);
		// Vetor na posi��o 2
		System.out.println(vect[2]);
	}

}
