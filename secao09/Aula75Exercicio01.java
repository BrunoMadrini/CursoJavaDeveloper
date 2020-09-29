package secao09;

import java.util.Locale;
import java.util.Scanner;

import entitiessecao09.Products;

public class Aula75Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Data");
		System.out.print("Name:  ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Products products = new Products(name, price, quantity); //Serve para proteger que não exista dados nulos na hora da construção


		// Saída
		System.out.println();
		System.out.println("Product Data: " + products);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		products.addProducts(quantity); // Atualiza a quantidade dentro do objeto product

		System.out.println();
		System.out.println("Updated Data: " + products);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + products);

		sc.close();
	}

}
