// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste 
// círculo com quatro casas decimais.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio02 {

	public static void main(String[] args) {
		
		//Variáveis
		Locale.setDefault(Locale.US); //Comando para transformar em padrão US.
		Scanner sc = new Scanner (System.in);
		double r, area;
		
		//Entrada
		System.out.print("Informe o valor do raio do cículo: ");
		r = sc.nextDouble();
		
		//Processamento
		area = Math.PI * Math.pow(r, 2);
		
		//Saída
		System.out.printf("A área do círculo é %.4f: ", area);
		
		sc.close();		
	}

}
