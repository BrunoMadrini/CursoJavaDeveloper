// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada 
// pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
// Calcule e mostre o valor a ser pago.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Vari�veis
		Scanner sc = new Scanner (System.in);
		@SuppressWarnings("unused")
		double cod1, n1, valor1, cod2, n2, valor2, total;
		
		//Entradas
		System.out.print("Informe o c�digo da pe�a: ");
		cod1 = sc.nextDouble();
		
		System.out.print("Informe a quantidade de pe�as: ");
		n1 = sc.nextDouble();
		
		System.out.print("Informe o valor da pe�a: ");
		valor1 = sc.nextDouble();
		
		System.out.print("Informe o c�digo da pe�a: ");
		cod2 = sc.nextDouble();
		
		System.out.print("Informe a quantidade de pe�as: ");
		n2 = sc.nextDouble();
		
		System.out.print("Informe o valor da pe�a: ");
		valor2 = sc.nextDouble();
		
		
		//Processamento
		total = (n1 * valor1) + (n2 * valor2);
		
		//Sa�da
		System.out.printf("O total a pagar �: R$ %.2f ", total);
		
		sc.close();
		
	}
}
