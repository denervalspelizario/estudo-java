package util;

public class Calculator {
	
	public  final double PI = 3.14159;  // declarando uma constante  (tem que contar o "final")
	  										 // (o padrao de constant é tudo UPPERCASE e usase tb underline)	

	
	public  double circumference(double radius) {  // criando a funcao cirumference
		return 2.0 * PI * radius;
	}
	
	public  double volume(double radius) {  // criando a funcao volume
		return 4.0 * PI * (radius * radius * radius) / 3;
	}
}
