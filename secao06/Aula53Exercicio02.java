// Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em
// seguida. Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do 
// intervalo, mostrando essas informa��es conforme exemplo (use a palavra "in" para dentro do 
// intervalo, e "out" para fora do intervalo).

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Vari�veis
		Scanner sc = new Scanner (System.in);
		int n, x, out = 0, in = 0;
		
		// Entrada
		System.out.print("Informe a quantidade de valores: ");
		n = sc.nextInt();
		
		// Processamento
		for (int i = 1; i <= n; i++) {
			System.out.print("Informe um valor: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		System.out.println("Out: " + out);
		System.out.print("In: " + in);
		
		sc.close();
	}

}
