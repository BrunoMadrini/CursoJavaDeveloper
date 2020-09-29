//Entities da Aula 66 Exercício 01

package entitiessecao08;

public class Products {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) { // Entre parênteses recebe o argumento do método
		this.quantity += quantity; // This serve para especificar o atributo da classe, quando há ambiguidade
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //Sobrepondo a String padrão que vem junto ao object Prodcuts
		return  name
				+ ", $ " 
				+ String.format("%.2f", price) //Formatar a saída co duas casas decimais 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
