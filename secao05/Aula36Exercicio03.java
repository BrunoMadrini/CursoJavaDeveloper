// Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
// "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros 
// devem poder ser digitados em ordem crescente ou decrescente.

package secao05;

import java.util.Scanner;

public class Aula36Exercicio03 {

	public static void main(String[] args) {
		
		//Vari�veis
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		//Entrada
		System.out.print("Informe um valor para A: ");
		a = sc.nextInt();
		
		System.out.print("Informe um valor para B: ");
		b = sc.nextInt();
		
		//Processamento
		if (a % b == 0 || b % a == 0) {
			System.out.print("S�o m�ltiplos.");
		}
		else {
			System.out.print("N�o s�o m�ltiplos.");
		}

		sc.close();
	}
}