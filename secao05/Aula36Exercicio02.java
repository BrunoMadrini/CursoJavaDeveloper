// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio02 {

	public static void main(String[] args) {
		
		//Vari�veis
		Scanner sc = new Scanner (System.in);
		double x;
		
		//Entrada
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();
		
		//Processamento
		if(x % 2 == 0) {
			System.out.print("O valor informado � par.");
		}
		else {
			System.out.print("O valor informado � impar.");
		}

		sc.close();
	}

}
