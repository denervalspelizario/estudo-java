package estruturaRepetitivaDoWhile;

import java.util.Locale;
import java.util.Scanner;


public class MainDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale. US);
		Scanner inputDado = new Scanner(System.in);
		
		char dado = 0;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			
			double numeroRecebido = inputDado.nextDouble();
			
			double fah = (9.0 * numeroRecebido / 5) + 32;
			
			System.out.println("Equivalente a Fahrenheit: " + fah);
			System.out.println("Deseja repetir? (s/n)");
			dado = inputDado.next().charAt(0);
			
		  }while(dado == 's') ;
		
		System.out.println("Você encerrou o programa!");	
		inputDado.close();
	}

}
