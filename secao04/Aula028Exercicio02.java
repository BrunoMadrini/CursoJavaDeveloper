// Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste 
// c�rculo com quatro casas decimais.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio02 {

	public static void main(String[] args) {
		
		//Vari�veis
		Locale.setDefault(Locale.US); //Comando para transformar em padr�o US.
		Scanner sc = new Scanner (System.in);
		double r, area;
		
		//Entrada
		System.out.print("Informe o valor do raio do c�culo: ");
		r = sc.nextDouble();
		
		//Processamento
		area = Math.PI * Math.pow(r, 2);
		
		//Sa�da
		System.out.printf("A �rea do c�rculo � %.4f: ", area);
		
		sc.close();		
	}

}
