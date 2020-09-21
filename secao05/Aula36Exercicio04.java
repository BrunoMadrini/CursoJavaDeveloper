// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o 
// mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 
// 24 horas.


package secao05;

import java.util.Scanner;

public class Aula36Exercicio04 {

	public static void main(String[] args) {
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		int h_in, h_final, duracao;
		
		//Entrada
		System.out.print("Informe o horário inicial do jogo: ");
		h_in = sc.nextInt();
		
		System.out.print("Informe o horário final do jogo: ");
		h_final = sc.nextInt();
		
		//Processamento
		if(h_in < h_final) {
			duracao = h_final - h_in;
		}
		else {
			duracao = 24 - h_in + h_final;
		}
		
		System.out.print("O joge teve uma duração de " + duracao + " horas.");
		
		sc.close();
	}

}
