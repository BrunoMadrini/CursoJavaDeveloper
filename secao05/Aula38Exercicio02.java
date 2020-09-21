package secao05;

import java.util.Scanner;

public class Aula38Exercicio02 {

	public static void main(String[] args) {

		// Variáveis
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;

		// Entrada
		System.out.print("Informe o dia da semana: ");
		x = sc.nextInt();

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}

		System.out.print(dia);

		sc.close();
	}

}
