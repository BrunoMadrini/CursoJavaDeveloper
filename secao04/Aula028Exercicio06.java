// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, 
// calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.


package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		double A, B, C, a_trian, a_circ, a_trap, a_quad, a_ret;
		
		//Entrada
		System.out.print("Informe o valor de A: ");
		A = sc.nextDouble();
		
		System.out.print("Informe o valor de B: ");
		B = sc.nextDouble();
		
		System.out.print("Informe o valor de C: ");
		C = sc.nextDouble();
		
		//Processamento
		a_trian = (A * C) / 2;
		
		a_circ = Math.PI * (Math.pow(C, 2));
		
		a_trap = ((A + B) * C) / 2;
		
		a_quad = B * B;
		
		a_ret = A * B;
		
		//Saída
		
		System.out.printf("A área do triângulo é: %.3f %n", a_trian);
		System.out.printf("A área do círculo é:  %.3f %n", a_circ);
		System.out.printf("A área do trapézio é: %.3f %n", a_trap);
		System.out.printf("A área do quadrado é: %.3f %n", a_quad);
		System.out.printf("A área do retângulo é: %.3f %n", a_ret);
		
		sc.close();
	}

}
