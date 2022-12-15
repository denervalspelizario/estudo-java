package programRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo; // importando a class retangulo

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		
		Retangulo retanguloInput = new Retangulo();   // criando uma class filho chamada retanguloInput usando a class matriz Retangulo
		
		System.out.print("Enter rectangle width and height: ");
		retanguloInput.base = inputDado.nextDouble();  // como  product herda estrutura de Retangulo ela vi ter area e base alem das funcoes 
		retanguloInput.altura = inputDado.nextDouble();
		
		
		System.out.println();
		double area = retanguloInput.area();
		double perimetro = retanguloInput.perimetro();
		double diagonal = retanguloInput.diagonal();
		
		System.out.println("Area = "  + area);
		System.out.println("Perimetro = "  + perimetro);
		System.out.println("Diagonal = "  + diagonal);

	}

}
