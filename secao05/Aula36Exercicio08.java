// Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
// pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em 
// benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
// Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, 
// calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda.

// Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a 
// faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo 
// fornecido (abaixo), a taxa �  de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36
// no total. O valor deve ser impresso com duas casas decimais.

package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Comando para transformar em padr�o US.
		
		//Vari�veis
		Scanner sc = new Scanner (System.in);
		double salario, imposto;
		
		//Entrada
		System.out.print("Informe o sal�rio: ");
		salario = sc.nextDouble();
		
		//Processamento
		if(salario <= 2000) {
			imposto = 0;
		}
		else if(salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		}
		else if(salario <= 4500) {
		imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		}
		else {
			imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(imposto == 0) {
			System.out.print("Isento!");
		}
		else {
		System.out.printf("O valor do imposto � ser pago � de R$ %.2f", imposto);
		}
		
		sc.close();
	}
}
