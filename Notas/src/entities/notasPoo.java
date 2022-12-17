package entities;

public class notasPoo {
	public String nameAluno;   //  criando as atibuicoes e metodos(ou funcoes)  
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public String aprovacaoAluno() {  //  aviso para manha usar esse if else  no class principal
		
		 double notaBase = 60.00;	
		 double notaFinal = (nota1 + nota2 + nota3) / 3;
		 
		 	if(notaFinal >= notaBase ) {
		 		
					System.out.println("FINAL GRADE ="+ notaFinal );
					System.out.println("Pass");
				} else {
					
					System.out.println("FINAL GRADE ="+ notaFinal );
					System.out.println("Failed");
					
					double notaMissing = notaBase - notaFinal;
					System.out.println("MISSING "+ notaMissing +" Points");
				};
			
	}
}
