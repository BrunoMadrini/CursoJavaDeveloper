package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula43Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Vari�veis
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
		
		//Sa�da
		System.out.printf("A �rea do terreno � de %.2f", area);
		System.out.printf("O valor do terreno � de R$ %.2f", preco);
		
		sc.close();
	}

}
