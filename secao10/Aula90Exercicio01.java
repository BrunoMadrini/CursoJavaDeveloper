/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo estes quartos ident.
 * pelos números 0 a 9. Fazer um programa que inicie com os 10 quartos vazios e depois leia uma quant.
 * n representando o número de estudantes que vão alugar os quartos (N pode ser de 0 a 10). Em seguida,
 * registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do 
 * estudande, bem como qual dos quartos ele escolheu. Suponha que seja escolhido um quarto vago. Ao 
 * final, seu programa deve imprimir um relatório de todas oscupações do pensionato. */

package secao10;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entitiessecao10.Rent;

public class Aula90Exercicio01 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for(int i = 1; i <= rooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
						
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}