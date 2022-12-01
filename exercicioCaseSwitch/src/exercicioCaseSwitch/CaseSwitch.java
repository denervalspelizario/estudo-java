package exercicioCaseSwitch;


import java.util.Scanner;

public class CaseSwitch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o dia da Semana (1 a 7)");
		
		int dia;
		
		
		dia = sc.nextInt();
		
		switch(dia) {
		
			case 1: 
				System.out.println("Voce escolheu o domingo");
				break;
			case 2: 
				System.out.println("Voce escolheu a segunda-feria");
				break;	
				
			case 3: 
				System.out.println("Voce escolheu a terça-feira");
				break;
			case 4: 
				System.out.println("Voce escolheu a quarta-feira");
				break;
			case 5: 
				System.out.println("Voce escolheu a quinta-feira");
				break;	
				
			case 6: 
				System.out.println("Voce escolheu a sexta-feira");
				break;	
			case 7: 
				System.out.println("Voce escolheu o sabado");
				break;		
			default:
				System.out.println("Valor nao permitido reinicie o app");
				break;	
		};
			
		
		sc.close();	
		

	}

}
