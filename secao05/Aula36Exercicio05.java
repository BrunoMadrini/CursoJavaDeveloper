// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste 
// item. A seguir, calcule e mostre o valor da conta a pagar.

package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Comando para transformar em padrão US.

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int codigo, qtde;
		double total = 0;

		// Entrada
		System.out.println("Produtos: ");
		System.out.println("1 - Cachorro Quente.");
		System.out.println("2 - X-Salada.");
		System.out.println("3 - X-Bacon.");
		System.out.println("4 - Torrada Simples.");
		System.out.println("5 - Refrigerante.");
		System.out.print("Informe o código do produto: ");
		codigo = sc.nextInt();

		System.out.print("Informe a quantidade: ");
		qtde = sc.nextInt();

		// Processamento
		if (codigo == 1) {
			total = qtde * 4.00;
		}
		if (codigo == 2) {
			total = qtde * 4.50;
		}
		if (codigo == 3) {
			total = qtde * 5.00;
		}
		if (codigo == 4) {
			total = qtde * 2.0;
		}
		if (codigo == 5) {
			total = qtde * 1.50;
		}
		if (codigo >= 6) {
			System.out.print("Item não localizado, favor verificar o código.");
		}
		System.out.printf("O valor total é de R$ %.2f.", total);

		sc.close();
	}
}
