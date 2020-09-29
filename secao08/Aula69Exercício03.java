/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do
 * ano. Ao final, mostrar qual a nota final do aluno. Dizer, também, se o aluno está aprovado ou não
 * e, em caso negativo, mostrar quantos pontos faltam para o aluno obter a média  (60% das notas). */
 

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.Student;

public class Aula69Exercício03 {

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
