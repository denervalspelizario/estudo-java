
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
		
		
		
		
		inputDado.close();
	}

}
