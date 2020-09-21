// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em 
// um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos  
// eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem 
// �Origem�. Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
// situa��o.

package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Comando para transformar em padr�o US.

		// Vari�veis
		Scanner sc = new Scanner(System.in);
		double x, y;

		// Entrada
		System.out.print("Informe um valor para o eixo x: ");
		x = sc.nextDouble();

		System.out.print("Informe um valor para o eixo y: ");
		y = sc.nextDouble();

		// Processamento

		if (x > 0 && y > 0) {
			System.out.print("Q1");
		} 
		else if (x > 0 && y < 0) {
			System.out.print("Q4");
		} 
		else if (x < 0 && y > 0) {
			System.out.print("Q2");
		} 
		else if (x < 0 && y < 0) {
			System.out.print("Q3");
		} 
		else if (x == 0) {
			System.out.print("Eixo Y");
		}
		else if (y == 0) {
			System.out.print("Eixo X");
		}
		else if (x == 0 && y == 0) {
			System.out.print("Origem");
		}
		sc.close();
	}

}
