package inputDados;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {/*O sc é uma variavel*/}
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		System.out.println("----------------");
		
		int z;
		z = sc.nextInt();
		System.out.println("Voce digitou: " + z);
		
		System.out.println("----------------");
		
		Locale.setDefault(Locale.US);
		double Z;
		Z = sc.nextDouble();
		System.out.println("O valor da variável do tipo double é " + Z);
		
		System.out.println("----------------");
		char C;
		C = sc.next().charAt(0);
		System.out.println("O valor da variável do tipo char é " + C);

		
		
		
		sc.close();
	}

}
