// Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostrar a soma dos
// números lidos.

package secao06;

import java.util.Scanner;

public class Aula44Exercicio02 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int n1, soma = 0;

		// Entrada
		System.out.print("Informe um número: ");
		n1 = sc.nextInt();

		// Processamento
		while (n1 != 0) {
			soma = soma + n1;
			// na linha acima podemos utilizar o operador de atribuicao cumulativa (soma += x)
			System.out.print("Informe um número: ");
			n1 = sc.nextInt();
		}

		// Saída
		System.out.print("O resultado da soma dos números informados é: " + soma);

		sc.close();
	}

}
