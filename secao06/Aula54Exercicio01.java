// Fazer um programa para ler uma temperatura em Celcius e mostrar o equivalente em Fahrenhait.
// Perguntar se o usu�rio deseja repetir (sim/n�o). Caso sim, repetir o programa.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula54Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		// Entrada, Processamento e Sa�da
		do {
			System.out.print("Informe a temperatura em �C: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.println("A temperatura em Fahrenhait � de " + F + " graus.");
			System.out.print("Deseja repetir (S/N)?: ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
