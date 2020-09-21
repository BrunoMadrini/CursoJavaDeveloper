/* Fazer um programa para ler tr�s n�meros inteiros e mostrar na tela o maior deles */

package secao07;

import java.util.Locale;
import java.util.Scanner;

public class Aula59Exerc�cio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada
		System.out.print("Informe tr�s n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}

	// Criar fun��o para mostrar o maior n�mero dos tr�s inseridos.
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.print("Higher = " + value);
	}
}
