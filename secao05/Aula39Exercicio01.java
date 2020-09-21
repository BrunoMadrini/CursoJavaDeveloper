// Exemplo utilizando expressão ternária em um programa.
// Neste exemplo temos um programa para calcular o valor de um desconto sobre um item.

package secao05;

import java.util.Scanner;

public class Aula39Exercicio01 {

	public static void main(String[] args) {
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		double preco, desconto;
		
		//Entrada
		System.out.print("Informe o valor do item: ");
		preco = sc.nextDouble();
		
		//Processamento
		//Modo normal
		if(preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.printf("O valor do item, com desconto, é de R$ %.2f %n", desconto);

		//Modo com expressão ternária
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.printf("O valor do item, com desconto, é de R$ %.2f", desconto);
		
		sc.close();
	}

}
