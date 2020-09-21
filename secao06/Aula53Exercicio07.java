// Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela 
// N linhas, come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o 
// cubo do valor, conforme exemplo.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Vari�veis
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
