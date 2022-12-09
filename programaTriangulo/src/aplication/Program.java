package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os valores de cada lado do triangulo X: ");
		
		
		xA = inputDado.nextDouble();
		xB = inputDado.nextDouble();
		xC = inputDado.nextDouble();
		
		
		System.out.println("Digite os valores de cada lado do triangulo Y: ");
		
		
		yA = inputDado.nextDouble();
		yB = inputDado.nextDouble();
		yC = inputDado.nextDouble();
		
	
		
		double p = (xA + xB + xC) / 2;
		
		
		inputDado.close();
	}

}
