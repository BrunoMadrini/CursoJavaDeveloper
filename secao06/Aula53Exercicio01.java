// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por 
// linha, inclusive o X, se for o caso.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Variáveis
		Scanner sc = new Scanner (System.in);
		int x;
		
		// Entrada
		System.out.print("Informe um valor inteiro: ");
		x = sc.nextInt();
		
		// Processamento
		for (int i = 0; i <= x; i++) {
			if (i %2 != 0) {
				System.out.println(i);
			}
			
			sc.close();
		}
	}

}
