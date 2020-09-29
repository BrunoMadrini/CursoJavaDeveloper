//Entitie da Aula 69 Exercício 03

package entitiessecao08;

public class Student {

	public String name;
	public double first;
	public double second;
	public double third;
	
	public double notes() {
		return (first + second + third);
	}
	
	public double miss() {
		return 60 - notes();
	}
	
	public String pass() {
		if(notes() >= 60.0) {
			return "PASS";
		}
		else {
		return "FAILED \n" + "MISSING " + String.format("%.2f", miss()) + " POINTS.";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", notes()) + "\n"
				+ pass();
	}
}
