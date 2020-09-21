// Exemplos de funções matemáticas.

package secao04;

import java.util.Scanner;

public class Aula027Ex01 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		double x, y;

		// Função para calcular a raiz quadrada do número informado
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();

		System.out.println("A raiz quadrada do número informado é: " + Math.sqrt(x));

		// Função para calcular o valor de x elevado a y.
		System.out.print("Informe o primeiro valor: ");
		x = sc.nextDouble();

		System.out.print("Informe o segundo valor: ");
		y = sc.nextDouble();

		System.out.println(x + " elevado a " + y + " = " + Math.pow(x, y));

		// Função que recebe o valor absoluto de um número informado
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();

		System.out.print("O valor absoluto do número informado é: " + Math.abs(x));

		sc.close();
	}

}