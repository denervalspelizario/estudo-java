package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo; // importando o Triangulo



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		
		Triangulo x, y;  // classe importada
		x = new Triangulo();   //x virou uma classe filho de Triangulo
		y = new Triangulo();  // y virou uma class filho de Triangulo
		
		
		System.out.println("Digite os valores de cada lado do triangulo X: ");
		
		
		x.a = inputDado.nextDouble();
		x.b = inputDado.nextDouble();
		x.c = inputDado.nextDouble();
		
		
		System.out.println("Digite os valores de cada lado do triangulo Y: ");
		
		
		y.a = inputDado.nextDouble();
		y.b = inputDado.nextDouble();
		y.c = inputDado.nextDouble();
		
	
		
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("O triangulo de maior area é o X");
		} else {
			System.out.println("O triangulo de maior area é o Y");
		}
		
		inputDado.close();
	}

}
