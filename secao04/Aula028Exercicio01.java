// Exerc�cio 01 - Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
// desses n�meros com uma mensagem explicativa.

package secao04;

import java.util.Scanner;

public class Aula028Exercicio01 {

	public static void main(String[] args) {
		
		//Vari�veis
		Scanner sc = new Scanner (System.in);
		int n1, n2, sum;
		
		//Entrada de dados
		System.out.print("Informe o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		n2 = sc.nextInt();
		
		//Processamento
		sum = n1 + n2;
		
		//Sa�da
		System.out.print("A soma dos dois valores informados � " + sum + ".");
		
		sc.close();
	}

}
