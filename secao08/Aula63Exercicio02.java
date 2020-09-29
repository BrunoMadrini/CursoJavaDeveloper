/* Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
possui a maior �rea. */

// Exerc�cio com POO

package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Aula63Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Vari�veis
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		// Entradas
		System.out.print("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.print("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// Processamento
		double areax = x.area(); // Estamos chamando o m�todo que criamos para calcular a �rea
		double areay = y.area();

		// Sa�da
		System.out.printf("Triangle X area: %.4f%n ", areax);
		System.out.printf("Triangle Y area: %.4f5n ", areay);

		if (areax > areay) {
			System.out.print("Larger Area: Triangule X");
		} else {
			System.out.print("Larger Area: Triangule Y");
		}

		sc.close();
	}

}
