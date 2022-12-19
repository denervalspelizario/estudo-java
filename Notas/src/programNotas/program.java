package programNotas;

import entities.notasPoo;
import java.util.Locale;
import java.util.Scanner;




public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);
		
		notasPoo notasInput = new notasPoo(); 
		
		System.out.println("Digite o nome do Aluno: ");
		notasInput.nameAluno = inputDado.nextLine();
		
		System.out.println("Digite as notas: ");
		notasInput.nota1 = inputDado.nextDouble();
		while(notasInput.nota1 > 30.00) {
			System.out.println("O valor da primeira nota deve ser abaixo de 30");
			notasInput.nota1 = inputDado.nextDouble();

		};
		notasInput.nota2 = inputDado.nextDouble();
		while(notasInput.nota2 > 35.00) {
			System.out.println("O valor da segunda nota deve ser abaixo de 35");
			notasInput.nota2 = inputDado.nextDouble();

		};
		notasInput.nota3 = inputDado.nextDouble();
		while(notasInput.nota3 > 35.00) {
			System.out.println("O valor da terceira nota deve ser abaixo de 35");
			notasInput.nota3 = inputDado.nextDouble();

		};

		double  notaFinalAluno = notasInput.notaFinalAluno();
		double notaBase = 60.00;
		
		
		if(notaFinalAluno >= notaBase ) {
	 		
			System.out.printf("FINAL GRADE =  %.2f%n", notaFinalAluno );
			System.out.println("Pass");
		} else {
			
			System.out.printf("FINAL GRADE =  %.2f%n", notaFinalAluno );
			System.out.println("Failed");
			
			double notaMissing = notaBase - notaFinalAluno;
			System.out.printf("MISSING  %.2f%n", notaMissing ," Points");
		};

		
		
	};

};
