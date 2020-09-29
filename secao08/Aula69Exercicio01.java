/* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na
tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado, conforme exemplo do
material */


package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.Rectangle;

public class Aula69Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		//Entrada
		System.out.print("Informe o valor da largura: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Informe o valor da altura: ");
		rectangle.height = sc.nextDouble();
		
		//Saída
		System.out.println(rectangle);
		
		
		sc.close();
	}

}
