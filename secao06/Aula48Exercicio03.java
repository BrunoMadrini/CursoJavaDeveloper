// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
// Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
// 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 
// 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
// código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de 
// clientes que abasteceram cada tipo de combustível.

package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula48Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variáveis
		Scanner sc = new Scanner(System.in);
		double tipo, qtde1 = 0, qtde2 = 0, qtde3 = 0;

		// Entrada
		System.out.print("Códigos:\n1 - Etanol\n 2 - Gasolina\n 3 - Diesel\n 4 - Fim!\n Informe o tipo de combustível: ");
		tipo = sc.nextDouble();

		// Processamento
		while (tipo != 4) {
			if (tipo == 1) {
				qtde1 = qtde1 + 1;
			} else if (tipo == 2) {
				qtde2 = qtde2 + 1;
			} else if (tipo == 3) {
				qtde3 = qtde3 + 1;
			}
			System.out.print("Códigos:\n1 - Etanol\n 2 - Gasolina\n 3 - Diesel\n 4 - Fim!\n Informe o tipo de combustível: ");
			tipo = sc.nextDouble();
		}
		System.out.println("Muito Obrigado!");
		System.out.printf("Clientes que abasteceram com Etanol: %.0f %n", qtde1);
		System.out.printf("Clientes que abasteceram com Gasolina: %.0f %n", qtde2);
		System.out.printf("Clientes que abasteceram com Diesel: %.0f %n", qtde3);
		
		sc.close();
	}
}
