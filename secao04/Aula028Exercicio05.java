// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada 
// peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
// Calcule e mostre o valor a ser pago.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		@SuppressWarnings("unused")
		double cod1, n1, valor1, cod2, n2, valor2, total;
		
		//Entradas
		System.out.print("Informe o código da peça: ");
		cod1 = sc.nextDouble();
		
		System.out.print("Informe a quantidade de peças: ");
		n1 = sc.nextDouble();
		
		System.out.print("Informe o valor da peça: ");
		valor1 = sc.nextDouble();
		
		System.out.print("Informe o código da peça: ");
		cod2 = sc.nextDouble();
		
		System.out.print("Informe a quantidade de peças: ");
		n2 = sc.nextDouble();
		
		System.out.print("Informe o valor da peça: ");
		valor2 = sc.nextDouble();
		
		
		//Processamento
		total = (n1 * valor1) + (n2 * valor2);
		
		//Saída
		System.out.printf("O total a pagar é: R$ %.2f ", total);
		
		sc.close();
		
	}
}
