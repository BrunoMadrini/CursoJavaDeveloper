// Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final mostrar a soma dos
// n�meros lidos.

package secao06;

import java.util.Scanner;

public class Aula44Exercicio02 {

	public static void main(String[] args) {

		// Vari�veis
		Scanner sc = new Scanner(System.in);
		int n1, soma = 0;

		// Entrada
		System.out.print("Informe um n�mero: ");
		n1 = sc.nextInt();

		// Processamento
		while (n1 != 0) {
			soma = soma + n1;
			// na linha acima podemos utilizar o operador de atribuicao cumulativa (soma += x)
			System.out.print("Informe um n�mero: ");
			n1 = sc.nextInt();
		}

		// Sa�da
		System.out.print("O resultado da soma dos n�meros informados �: " + soma);

		sc.close();
	}

}
