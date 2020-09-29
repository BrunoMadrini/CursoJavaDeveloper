/* Fazer um programa para ler um valor numérico qualquer, e daí mostrar quantos eria o valor de uma
 * circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI
 * com duas casas decimais.
 */

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.Calculator;

public class Aula70Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator circumference = new Calculator();
		
		System.out.print("Enter radius: ");
		circumference.radius = sc.nextDouble();
		
		System.out.print(circumference);
		
		sc.close();
	}

}