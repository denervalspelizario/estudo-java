package ternario;

public class MainTernario {

	public static void main(String[] args) {
		
		double valorTotalCompras = 1000;
		
		
		String aprovacaoCompras = (valorTotalCompras > 2000) ? "Valor execede o seu saldo": "Sua compra foi aprovada"; 
		
		System.out.println(aprovacaoCompras);

	}

}
