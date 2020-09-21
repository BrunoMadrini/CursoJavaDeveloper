// Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, 
// calcule e mostre:
// a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
// b) a �rea do c�rculo de raio C. (pi = 3.14159)
// c) a �rea do trap�zio que tem A e B por bases e C por altura.
// d) a �rea do quadrado que tem lado B.
// e) a �rea do ret�ngulo que tem lados A e B.


package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula028Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Vari�veis
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
		
		//Sa�da
		
		System.out.printf("A �rea do tri�ngulo �: %.3f %n", a_trian);
		System.out.printf("A �rea do c�rculo �:  %.3f %n", a_circ);
		System.out.printf("A �rea do trap�zio �: %.3f %n", a_trap);
		System.out.printf("A �rea do quadrado �: %.3f %n", a_quad);
		System.out.printf("A �rea do ret�ngulo �: %.3f %n", a_ret);
		
		sc.close();
	}

}
