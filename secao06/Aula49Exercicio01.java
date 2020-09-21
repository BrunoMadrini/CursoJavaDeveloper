// Faça um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostrar a soma 
// dos N números.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula49Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int n, n1, soma = 0;

		// Entrada
		System.out.print("Informe a quantidade de números: ");
		n = sc.nextInt();

		// Processamento
		for (int i = 0; i < n; i++) {
			System.out.print("Informe um valor: ");
			n1 = sc.nextInt();
			soma = soma + n1;
		}
		System.out.print("A soma dos números informados foi de " + soma);

		sc.close();
	}

}
