/*Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do
 * ano. Ao final, mostrar qual a nota final do aluno. Dizer, tamb�m, se o aluno est� aprovado ou n�o
 * e, em caso negativo, mostrar quantos pontos faltam para o aluno obter a m�dia  (60% das notas). */
 

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.Student;

public class Aula69Exerc�cio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		//Entrada
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Note in first semester: ");
		student.first = sc.nextDouble();
		
		System.out.print("Note in second semester: ");
		student.second = sc.nextDouble();
		
		System.out.print("Note in third semester: ");
		student.third = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
