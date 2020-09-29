package entitiessecao09;

public class Products {

	public String name;
	public double price;
	public int quantity;
	
	public Products (String name, double price, int quantity) { //Cria��o de um construtor para que receba dados no momento da instancia��o
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public void setName (String name) { //M�todo para definir um novo nome
		this.name = name;
	}
	
	public String getName () {			//M�todo para "pegar" o nome, por exemplo para imprimir.
		return name;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
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