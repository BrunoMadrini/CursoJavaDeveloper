//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio01 {

	public static void main(String[] args) {
		
		//Vari�veis
		Scanner sc = new Scanner (System.in);
		int x;
		
		//Entrada
		System.out.print("Informe um valor: ");
		x = sc.nextInt();
		
		//Processamento
		if (x >= 0) {
			System.out.print("O valor informado � positivo.");
		}
		else {
			System.out.print("O valor informado � negativo.");
		}

		sc.close();
	}

}
