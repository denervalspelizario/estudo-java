package exercicioCondicional;

import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		
		int planoBasico = 50;
		
		double minutosBasico = 100;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor em minutos consumidos no mes?");
		
		double Hora;
		
		
		Hora = sc.nextDouble();
		
		if(Hora <= minutosBasico ) {
			System.out.println("Voce ira pagar apenas o valor " + planoBasico + " referente ao plano basico");
		} else {
			
			
			double minutoHora = Hora / 60;
			double horaMinuto = 60 * minutoHora ;
			double valorPorHora = planoBasico / minutosBasico  ;
			
			double valorTotalPagar = horaMinuto * valorPorHora;
			
			System.out.println("Voce irá pagar o valor de " + valorTotalPagar);
			
		}
		
		sc.close();
		

	}

}
