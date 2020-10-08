/*Fazer um programa para ler um número inteiro N de pessoas e os dados (nome e preço) de N produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostar o preço médio dos itens. */

package secao10;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao10.Product;

public class Aula89Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) { //Vect.length significa a quantidade inteira do vetor
			sc.nextLine();
			System.out.print("Informe o Produto: ");
			String name = sc.nextLine();
			System.out.print("Informe o valor do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);

		}

		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice(); // Para pegar apenas o campo price
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);

		sc.close();
	}

}