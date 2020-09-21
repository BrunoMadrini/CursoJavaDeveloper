// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de 
//N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por defini��o, fatorial de 0 � 1.


package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Vari�veis
		Scanner sc = new Scanner (System.in);
		int n, fat = 1;
		
		// Entrada
		System.out.print("Informe um n�mero: ");
		n = sc.nextInt();
		
		// Processamento
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.print(fat);
				
		sc.close();
	}

}
