// Exercçicio para fixação da função split.

package secao07;

public class Aula58Exercicio02 {

	public static void main(String[] args) {

		String s = "potato apple lemon";

		// Neste caso estamos utilizando o espaço em branco como separador.
		// A função split vai transformar as palavras em vetores, utilizando o espaço como separador.
		String[] vect = s.split(" ");

		//String original
		System.out.println(s);
		// Vetor na posição 0
		System.out.println(vect[0]);
		// Vetor na posição 1
		System.out.println(vect[1]);
		// Vetor na posição 2
		System.out.println(vect[2]);
	}

}
