package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator; // ctrl + shift + o  importa automatico

public class Program {
	
						
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		Calculator calc = new Calculator();  // instanciei o calculator  de fora (nao esquecer de importar)
		
		System.out.print("Enter radius: ");
		double radius = inputDado.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		inputDado.close();

	}
	
	

}
