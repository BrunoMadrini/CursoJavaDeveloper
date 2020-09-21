// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
// senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada 
// corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
// Considere que a senha correta é o valor 2002.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula48Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int senha;

		// Entrada
		System.out.print("Informe a senha correta: ");
		senha = sc.nextInt();

		// Processamento
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.print("Informe a senha correta: ");
			senha = sc.nextInt();
		}
		System.out.print("Acesso permitido!");

		sc.close();
	}

}
