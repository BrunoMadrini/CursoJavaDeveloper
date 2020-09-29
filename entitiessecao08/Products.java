//Entities da Aula 66 Exerc�cio 01

package entitiessecao08;

public class Products {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) { // Entre par�nteses recebe o argumento do m�todo
		this.quantity += quantity; // This serve para especificar o atributo da classe, quando h� ambiguidade
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //Sobrepondo a String padr�o que vem junto ao object Prodcuts
		return  name
				+ ", $ " 
				+ String.format("%.2f", price) //Formatar a sa�da co duas casas decimais 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
