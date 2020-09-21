// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor 
// que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do 
// funcion�rio, com duas casas decimais.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio04 {

	public static void main(String[] args) {
		
		//Vari�veis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double func, h_trab, valor_h, salario;
		
		//Entradas
		System.out.print("Informe o c�digo do funcion�rio: ");
		func = sc.nextDouble();
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		h_trab = sc.nextDouble();
		
		System.out.print("Informe o valor da hora trabalhada: ");
		valor_h = sc.nextDouble();
		
		//Processamento
		salario = valor_h * h_trab;
		
		//Sa�da
		System.out.println("C�digo do funcion�rio: " + func);
		System.out.print("Sal�rio a receber: R$ " + salario + ".");
		
		sc.close();
	}

}
