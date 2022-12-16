package Entities;

public class Salario {

	public String name;   //  criando as atibuicoes e metodos(ou funcoes)  
	public double salarioBruto;
	public double imposto;
	public double porcentagemAumentoSalario;
	
	
	public double salarioLiquido() {  // 
		
		return salarioBruto - imposto;
			
	}
	
	public double aumentoSalarioLiquido () {
		return ((salarioBruto * porcentagemAumentoSalario) / 100) + salarioLiquido();
	}
	
	
	
}
