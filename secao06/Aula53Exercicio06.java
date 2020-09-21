// Ler um número inteiro N e calcular todos os seus divisores.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int n;

		// Entrada
		System.out.print("Informe um valor: ");
		n = sc.nextInt();

		// Processamento
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
