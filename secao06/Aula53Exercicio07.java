// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela 
// N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o 
// cubo do valor, conforme exemplo.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Variáveis
		Scanner sc = new Scanner (System.in);
		int n;
		
		// Entrada
		System.out.print("Informe a quantidade: ");
		n = sc.nextInt();
		
		//Processamento
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i*i + " ");
			System.out.println(i*i*i);
		}

		sc.close();
	}

}
