/* Fazer um programa para ler três números inteiros e mostrar na tela o maior deles */

package secao07;

import java.util.Locale;
import java.util.Scanner;

public class Aula59Exercício01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada
		System.out.print("Informe três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}

	// Criar função para mostrar o maior número dos três inseridos.
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
