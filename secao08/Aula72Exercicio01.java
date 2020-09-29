/*Faça um programa para ler a cotação do dólar e, depois, um valor em dólares a ser comprado por uma
 * pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
 * pessoa terá que pagar 6% de IOF sobre o valor do dólar.
 */

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.CurrencyConverter;

public class Aula72Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("What`s the dollar price? ");
		double dollarValue = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		double p = CurrencyConverter.dollarToReal(dollarValue, bought);
		
		System.out.printf("Amount to be paid in Reais: %.2f", p);
		
				
		sc.close();
	}

}
