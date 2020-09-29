/* Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quantos eria o valor de uma
 * circunfer�ncia e do volume de uma esfera para um raio daquele valor. Informar tamb�m o valor de PI
 * com duas casas decimais.
 */

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.CalculatorStatic;

public class Aula71Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorStatic.circumference(radius);
		double v = CalculatorStatic.volume(radius);
		
		System.out.printf("Circumference:  %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f", CalculatorStatic.PI);
		
	
		sc.close();
	}

}