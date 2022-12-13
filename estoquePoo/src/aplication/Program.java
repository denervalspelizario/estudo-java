package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product; // importando a class Product



public class Program {

	public static void main(String[] args) {
		// 1 se cria  a aplicacao  2- cria a classe separado onde se coloca as atribuicoes e metodos

		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		
		
		Product product = new Product();   // criando uma class filho chamada product usando a class matriz Product
		
		System.out.println("Enter product Data: ");
		System.out.print("Name: ");
		product.name = inputDado.nextLine();  // como  product herda estrutura de Product ela vi ter name, price e quantity alem das funcoes addProducts e removeProducts 
		System.out.print("Price: ");
		product.price = inputDado.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = inputDado.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);  // chamando o String to String apenas dando o println com o nome da class filho  product 
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = inputDado.nextInt();
		product.addProducts(quantity);  // chamo a funcao addProducts para receber quantidade quantity que o usuario quer adicionar
		
		System.out.println();
		System.out.println("Update data: " + product );
		
		
		System.out.println();
		System.out.print("Enter the number of products to be remove in stock: ");
		int removeQuantity = inputDado.nextInt();
		product.removeProducts(removeQuantity);  // chamo a funcao removeProducts para receber quantidade quantity que o usuario quer adicionar
		
		System.out.println();
		System.out.println("Update data: " + product );
		
		 
		inputDado.close();
	}

}
