/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo estes quartos ident.
 * pelos números 0 a 9. Fazer um programa que inicie com os 10 quartos vazios e depois leia uma quant.
 * n representando o número de estudantes que vão alugar os quartos (N pode ser de 0 a 10). Em seguida,
 * registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do 
 * estudande, bem como qual dos quartos ele escolheu. Suponha que seja escolhido um quarto vago. Ao 
 * final, seu programa deve imprimir um relatório de todas oscupações do pensionato. */

package secao10;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao10.Rooms;

public class Aula90Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rooms[] vect = new Rooms[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Enter guest`s name: ");
			String name = sc.nextLine();
			System.out.print("Enter guest`s email: ");
			String email = sc.nextLine();
			System.out.print("Enter guest`s room: ");
			int room = sc.nextInt();
			
			vect[i] = new Rooms(name, email, room);
		}
		
			
		
		
		
		sc.close();
	}

}
