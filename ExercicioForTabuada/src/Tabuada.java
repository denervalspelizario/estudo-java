

import java.util.Scanner;

public class Tabuada {
	
	

	public static void main(String[] args) {
		
		
		
		Scanner inputDado = new Scanner(System.in);
		
		
		System.out.println("Digite o numero da tabuada que gostaria de saber!");
		
		int numeroRecebido = inputDado.nextInt();
		
		for(int i = 1; i <= 10; i++ ) {
			
			int valorTabuada = i * numeroRecebido;
			
			System.out.println(i + " x " + numeroRecebido + " = " + valorTabuada);
			
		}

	}

}
