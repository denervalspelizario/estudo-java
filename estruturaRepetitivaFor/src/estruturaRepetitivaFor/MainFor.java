package estruturaRepetitivaFor;


import java.util.Scanner;


public class MainFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros gostaria de somar?");
		
		int numeroRecebido = sc.nextInt();
		
		int valorSomado = 0;
		
		
		
		
		for(int i = 0; i < numeroRecebido; i++ ) {
		
			int a = i + 1;
			System.out.println("Digite o "+ a + " numero!");
			int numeroSomar = sc.nextInt();	
			valorSomado += numeroSomar;
			
		};

		System.out.println("O valor da soma dos numeros digitados é " + valorSomado);
		
		sc.close();
		
	}

}
