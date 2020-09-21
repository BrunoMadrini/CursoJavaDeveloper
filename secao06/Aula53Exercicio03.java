// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
// teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada 
// para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor 
// tem peso 3 e o terceiro valor tem peso 5.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int n;
		double a, b, c, media = 0;

		// Entrada
		System.out.print("Informe a quantidade de valores: ");
		n = sc.nextInt();

		// Processamento
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o primeiro valor: ");
			a = sc.nextDouble();

			System.out.print("Informe o segundo valor: ");
			b = sc.nextDouble();

			System.out.print("Informe o terceiro valor: ");
			c = sc.nextDouble();

			media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

			System.out.printf("A média ponderada é %.1f %n", media);
		}
		
		sc.close();
	}

}
