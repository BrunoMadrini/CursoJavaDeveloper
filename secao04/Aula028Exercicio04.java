// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor 
// que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do 
// funcionário, com duas casas decimais.

package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio04 {

	public static void main(String[] args) {
		
		//Variáveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double func, h_trab, valor_h, salario;
		
		//Entradas
		System.out.print("Informe o código do funcionário: ");
		func = sc.nextDouble();
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		h_trab = sc.nextDouble();
		
		System.out.print("Informe o valor da hora trabalhada: ");
		valor_h = sc.nextDouble();
		
		//Processamento
		salario = valor_h * h_trab;
		
		//Saída
		System.out.println("Código do funcionário: " + func);
		System.out.print("Salário a receber: R$ " + salario + ".");
		
		sc.close();
	}

}
