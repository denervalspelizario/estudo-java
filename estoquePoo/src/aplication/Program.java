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
		System.out.println("Name: ");
		product.name = inputDado.nextLine();  // como  product herda estrutura de Product ela vi ter name, price e quantity alem das funcoes addProducts e removeProducts 
		System.out.println("Price: ");
		product.price = inputDado.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = inputDado.nextInt();
		
		
		System.out.println(product);  // chamando o String to String apenas dando o println com o nome da class filho  product 
 
		
		

		
		
		inputDado.close();
	}

}
