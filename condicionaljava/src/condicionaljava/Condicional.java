package condicionaljava;


import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Hora;
		
		
		
		System.out.println("Qual o horario neste momento?");
		
		Hora = sc.nextInt();
		
			
		
		if(Hora > 0 && Hora < 12) {
			
			System.out.println("Bom dia !!");
			
			
			
			} else if(Hora >= 12 && Hora <= 18) {
			
				System.out.println("Boa tarde !!");
			
			} else {
			
				System.out.println("Boa noite !!");
			
		}
		
		

		
		sc.close();
		
	}

}
