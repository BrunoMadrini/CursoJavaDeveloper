// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
// telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa que
// leia a quantidade de minutos que uma pessoa consumiu e mostrar o valor a ser pago.

package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula37Ecercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Comando para transformar em padrão US.
		
		//Variáveis
		Scanner sc = new Scanner (System.in);
		double min, conta;
		
		//Entrada
		System.out.print("Informe quantos minutos de franquia foi utilizado: ");
		min = sc.nextDouble();
		
		//Processamento
		if(min > 100) {
			conta = ((min - 100) * 2.00) + 50.00;
			//podemos utilizar também conta += (minutos - 100) * 2.00 - É um operador de atribuição acumulativa
		}
		else {
			conta = 50.00;
		}
		System.out.printf("O valor a ser pago é de R$ %.2f", conta);
		
		sc.close();
	}

}
