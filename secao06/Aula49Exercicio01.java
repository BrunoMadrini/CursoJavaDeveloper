// Fa�a um programa que l� um valor inteiro N e depois N n�meros inteiros. Ao final, mostrar a soma 
// dos N n�meros.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula49Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Vari�veis
		Scanner sc = new Scanner(System.in);
		int n, n1, soma = 0;

		// Entrada
		System.out.print("Informe a quantidade de n�meros: ");
		n = sc.nextInt();

		// Processamento
		for (int i = 0; i < n; i++) {
			System.out.print("Informe um valor: ");
			n1 = sc.nextInt();
			soma = soma + n1;
		}
		System.out.print("A soma dos n�meros informados foi de " + soma);

		sc.close();
	}

}
