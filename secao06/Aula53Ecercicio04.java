// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do 
// primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula53Ecercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Variáveis
		Scanner sc = new Scanner (System.in);
		int n = 0;
		double n1, n2, div;
		
		// Processamento
		for (int i = 0; i <= n; i++) {
			System.out.print("Informe o primeiro número: ");
			n1 = sc.nextDouble();
			
			System.out.print("Informe o segundo número: ");
			n2 = sc.nextDouble();
			
			div = n1 / n2;
			
			if(n2 != 0) {
				System.out.print(div);
			}
			else {
				System.out.print("Divisão Impossível!");
			}
		}
		
		sc.close();
	}

}
