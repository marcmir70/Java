//uDemy, curso Java Completo, secao 13, aula 65
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Modulo08_Product;

public class Modulo08_aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Modulo08_Product product = new Modulo08_Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product); // implicitamente chama metodo .toString()
		// System.out.println(product.name + ", " + product.price + ", " + product.quantity);

		System.out.println();
		System.out.print("Enter the number of products to be added to stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product); 
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product); 
		
		sc.close();
	}
}