// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no 
// sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será 
// encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem).

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula48Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int x, y;

		// Entrada
		System.out.print("Informe a coordenada do eixo x: ");
		x = sc.nextInt();

		System.out.print("Informe a coordenada do eixo y: ");
		y = sc.nextInt();

		// Processamento
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("Segundo quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("Quarto quadrante.");
			} else {
				System.out.println("Terceiro quadrante.");
			}
			System.out.print("Informe a coordenada do eixo x: ");
			x = sc.nextInt();

			System.out.print("Informe a coordenada do eixo y: ");
			y = sc.nextInt();

		}

		sc.close();
	}

}
