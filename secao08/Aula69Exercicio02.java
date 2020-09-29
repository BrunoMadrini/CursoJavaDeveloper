/* Fazer um programa para ler os dados de um funcionário. Em seguida, mostrar os dados do funcionário.
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem informada e mostrar
 * novamente os dados do funcionário com o novo salário. */

package secao08;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao08.Employee;

public class Aula69Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
				
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + employee);
		System.out.println();
		
		System.out.println();
		System.out.print("Wich percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);				
		
		sc.close();
	}

}
