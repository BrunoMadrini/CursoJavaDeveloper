package entitiessecao09;

public class Account {

	private int number;
	private String name;
	private double balance;

	// Contructors
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	// Getters e Setters

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// Métodos

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	// toString
	public String toString() {
		return "Account: " + number + ", Holder: " + name + ", Balance: " + String.format("%.2f", balance);

	}

}
