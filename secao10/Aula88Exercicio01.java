/*Fazer um programa para ler um número inteiro N de pessoas e a altura de N pessoas. Armazene as N
 * alturas em um vetor. Em seguida, mostar a altura média dessas pessoas. */

package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Aula88Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n]; //Criando um vetor vect com o tamanho de n elementos
		for(int i = 0; i < n; i++) {
			System.out.print("Informe a altura da pessoa: ");
			vect[i] = sc.nextDouble(); //Vetor, na posição i, vai receber o valor da altura que será informada
		}
		
		double sum = 0;					//Variável soma para somar todos valores do vetor
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
