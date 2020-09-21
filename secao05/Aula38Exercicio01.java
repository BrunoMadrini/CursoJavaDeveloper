package secao05;

import java.util.Scanner;

public class Aula38Exercicio01 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;

		// Entrada
		System.out.print("Informe um valor para o dia da semana: ");
		x = sc.nextInt();

		// Processamento
		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda-feira";
		} else if (x == 3) {
			dia = "Terça-feira";
		} else if (x == 4) {
			dia = "Quarta-feira";
		} else if (x == 5) {
			dia = "Quinta-feira";
		} else if (x == 6) {
			dia = "Sexta-feira";
		} else if (x == 7) {
			dia = "Sábado";
		} else {
			dia = "Valor inválido";
		}

		System.out.print(dia);

		sc.close();
	}

}
