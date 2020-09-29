package secao08;

import java.util.Locale;
import java.util.Scanner;
import entitiessecao08.Products;

public class Aula66Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.println("Enter Product Data");
		System.out.print("Name:  ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		//Saída
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); //Atualiza a quantidade dentro do objeto product
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		sc.close();
	}

}
