// Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do
// primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Vari�vel
		Scanner sc = new Scanner (System.in);
		int n;
		double n1, n2, div;
		
		// Entradas
		System.out.print("Informe a quantidade: ");
		n = sc.nextInt();
		
		// Processamento
		for(int i = 1; i <= n; i++) {
			System.out.print("Informe o primeiro valor: ");
			n1 = sc.nextDouble();
			
			System.out.print("Informe o segundo valor: ");
			n2 = sc.nextDouble();
			
			if(n2 == 0) {
				System.out.print("Divis�o Imposs�vel!");
			}
			else {
			div = n1 / n2;
			System.out.println(div);
			
		}
		
	}
		sc.close();
	}
}
