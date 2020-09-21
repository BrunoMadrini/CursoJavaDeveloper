//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio01 {

	public static void main(String[] args) {
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		int x;
		
		//Entrada
		System.out.print("Informe um valor: ");
		x = sc.nextInt();
		
		//Processamento
		if (x >= 0) {
			System.out.print("O valor informado é positivo.");
		}
		else {
			System.out.print("O valor informado é negativo.");
		}

		sc.close();
	}

}
