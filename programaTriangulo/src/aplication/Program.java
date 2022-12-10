package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo; // importando o Triangulo



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		
		Triangulo x, y;  // classe importada
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Digite os valores de cada lado do triangulo X: ");
		
		
		x.a = inputDado.nextDouble();
		x.b = inputDado.nextDouble();
		x.c = inputDado.nextDouble();
		
		
		System.out.println("Digite os valores de cada lado do triangulo Y: ");
		
		
		y.a = inputDado.nextDouble();
		y.b = inputDado.nextDouble();
		y.c = inputDado.nextDouble();
		
	
		
		double p = (x.a + x.b + x.c) / 2;
		
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		
		p = (y.a + y.b + y.c) / 2;
		
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		
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
