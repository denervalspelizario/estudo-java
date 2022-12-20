package util;

public class calculator {
	
	public double dolarPrice;
	public double dolarQuantity;
	public static final double  IOF = 6;
	
	public  static final double IOF(double dolarQuantity) {   // declarando uma constante  (tem que contar o "final")
			
		return dolarQuantity * (IOF / 100);					  // (o padrao de constant é tudo UPPERCASE e usase tb underline)
	};  
		 									   
	
	
}
