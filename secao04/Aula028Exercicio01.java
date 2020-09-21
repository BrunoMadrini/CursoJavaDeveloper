// Exercício 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
// desses números com uma mensagem explicativa.

package secao04;

import java.util.Scanner;

public class Aula028Exercicio01 {

	public static void main(String[] args) {
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		int n1, n2, sum;
		
		//Entrada de dados
		System.out.print("Informe o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		n2 = sc.nextInt();
		
		//Processamento
		sum = n1 + n2;
		
		//Saída
		System.out.print("A soma dos dois valores informados é " + sum + ".");
		
		sc.close();
	}

}
