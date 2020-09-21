package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula43Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		double larg, comp, preco, m2, area;
		
		//Entrada
		System.out.print("Informe o comprimento do terreno: ");
		comp = sc.nextDouble();
		
		System.out.print("Informe a largura do terreno: ");
		larg = sc.nextDouble();
		
		System.out.print("Informe o valor do metro quadrado: ");
		m2 = sc.nextDouble();
		
		//Processamento
		area = comp * larg;
		preco = area * m2;
		
		//Saída
		System.out.printf("A área do terreno é de %.2f", area);
		System.out.printf("O valor do terreno é de R$ %.2f", preco);
		
		sc.close();
	}

}
