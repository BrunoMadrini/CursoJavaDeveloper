/* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área. */

// Exercício sem POO

package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Aula63Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// Entradas
		System.out.print("Enter the measures of triangle X: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.print("Enter the measures of triangle Y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		// Processamento
		double p = (a + b + c) / 2;
		double areax = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		p = (x + y + z) / 2;
		double areay = Math.sqrt(p * (p - x) * (p - y) * (p - z));

		// Saída
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
