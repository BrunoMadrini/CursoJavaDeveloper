// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio02 {

	public static void main(String[] args) {
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		double x;
		
		//Entrada
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();
		
		//Processamento
		if(x % 2 == 0) {
			System.out.print("O valor informado é par.");
		}
		else {
			System.out.print("O valor informado é impar.");
		}

		sc.close();
	}

}
