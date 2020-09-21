// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
// diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package secao04;

import java.util.Scanner;

public class Aula028Exercicio03 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dif;

		// Entrada
		System.out.print("Informe um valor para A: ");
		A = sc.nextInt();

		System.out.print("Informe um valor para B: ");
		B = sc.nextInt();

		System.out.print("Informe um valor para C: ");
		C = sc.nextInt();

		System.out.print("Informe um valor para D: ");
		D = sc.nextInt();

		// Processamento
		dif = (A * B - C * D);

		// Saída
		System.out.print("A diferença entre os valores informados é: " + dif + ".");

		sc.close();
	}
}
