

import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int valorSoma = 0;
		
		while(x != 0) {
			
			valorSoma += x;
			x = sc.nextInt();
			
		}
		
		System.out.println("O valor da soma dos numeros digitados é " + valorSoma);
		
		
		sc.close();
	
		
		
	}

}
