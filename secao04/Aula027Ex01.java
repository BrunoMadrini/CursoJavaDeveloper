// Exemplos de fun��es matem�ticas.

package secao04;

import java.util.Scanner;

public class Aula027Ex01 {

	public static void main(String[] args) {

		// Vari�veis
		Scanner sc = new Scanner(System.in);
		double x, y;

		// Fun��o para calcular a raiz quadrada do n�mero informado
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();

		System.out.println("A raiz quadrada do n�mero informado �: " + Math.sqrt(x));

		// Fun��o para calcular o valor de x elevado a y.
		System.out.print("Informe o primeiro valor: ");
		x = sc.nextDouble();

		System.out.print("Informe o segundo valor: ");
		y = sc.nextDouble();

		System.out.println(x + " elevado a " + y + " = " + Math.pow(x, y));

		// Fun��o que recebe o valor absoluto de um n�mero informado
		System.out.print("Informe um valor: ");
		x = sc.nextDouble();

		System.out.print("O valor absoluto do n�mero informado �: " + Math.abs(x));

		sc.close();
	}

}