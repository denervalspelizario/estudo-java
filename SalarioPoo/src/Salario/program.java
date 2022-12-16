package Salario;

import java.util.Locale;
import java.util.Scanner;

import Entities.Salario; // importando a class salario

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputDado = new Scanner(System.in);

		Salario salarioInput = new Salario(); 
		
		System.out.println("Digite os dados do funcionario");
		System.out.println();
		
		System.out.print("Name: ");
		salarioInput.name = inputDado.nextLine();
		
		
		System.out.print("Gross salary: ");
		salarioInput.salarioBruto = inputDado.nextDouble();
		
		System.out.print("Tax: ");
		salarioInput.imposto = inputDado.nextDouble();
		
		
		double salarioLiquido = salarioInput.salarioLiquido();

		
		
		System.out.println();
		System.out.println("Employee: "+ salarioInput.name +" $"+ salarioLiquido);
		
		System.out.print("Which percentage to increase salary? ");
		salarioInput.porcentagemAumentoSalario = inputDado.nextDouble();

		
		double aumentoSalarioLiquido = salarioInput.aumentoSalarioLiquido();
		
		System.out.println();
		System.out.printf("Update data: "+ salarioInput.name + ", $ %.2f%n", aumentoSalarioLiquido);
		
	}

}
