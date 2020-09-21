// Código usado para ler um texto até a quebra de linha, ou seja, uma linha inteira com mais de um 
// tipo de variável.

package secao04;

import java.util.Scanner;

public class Aula026Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;

		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		
		sc.nextLine(); //Serve para consumir a quebra de linha da variável acima.
		
		System.out.print("Digite a primeira frase: ");
		s1 = sc.nextLine();
		
		System.out.print("Digite a segunda frase: ");
		s2 = sc.nextLine();
		
		System.out.print("Digite a terceira frase: ");
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
