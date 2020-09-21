// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o 
// valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio06 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		double valor;

		// Entrada
		System.out.print("Informe um valor: ");
		valor = sc.nextDouble();

		// Processamento
		if (valor >= 0 && valor < 25) {
			System.out.print("O valor está entre o intervalo [0-25].");
		}
		else if (valor >= 25 && valor < 50) {
			System.out.print("O valor está entre o intervalo [25-50].");
		}
		else if (valor >= 50 && valor < 75) {
			System.out.print("O valor está entre o intervalo [50-75].");
		}
		else if (valor >= 75 && valor < 100) {
			System.out.print("O valor está entre o intervalo [75-100].");
		}
		else if (valor > 100) {
			System.out.print("Fora de intervalo");
		}

		sc.close();
	}

}
