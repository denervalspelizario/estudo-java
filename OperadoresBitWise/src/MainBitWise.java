

import java.util.Scanner;


public class MainBitWise {

	public static void main(String[] args) {
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		

		Scanner inputDado = new Scanner(System.in);
		int mask = 0b00100000; // o numero esta em binario mas pode ser em decimal normal no caso  32
		int number = inputDado.nextInt();
		
		if((number & mask) != 0) {
			System.out.println("O sexto bit é verdadeiro");
		} else {
			System.out.println("O sexto bit é falso");
		}
		
		inputDado.close();
		
	}

}
