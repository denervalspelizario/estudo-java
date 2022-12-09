
import java.util.Scanner;


public class MainFuncoes {

	public static void main(String[] args) {
		
		double y = 25.00;
		double x = Math.sqrt(y);   // funcao que retorna a raiz quadrada
		System.out.println(x); // retorna 5
		
		//-------------------------
		
		Scanner inputDado = new Scanner(System.in);
		
		System.out.println("Digite tres numeros: ");
		int a = inputDado.nextInt();
		int b = inputDado.nextInt();
		int c = inputDado.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		
		inputDado.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
		
	}
	
	public static  void showResult(int value) {
		System.out.println("O maior valor é " + value);
			
	}
	

}
