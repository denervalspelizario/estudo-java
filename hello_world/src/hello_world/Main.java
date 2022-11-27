package hello_world;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("o print escreve dado sem quebra de linha -- ");
		System.out.println("Hello World!!");
		System.out.println("já o println escreve o dado com quebra de linha");
		System.out.println("Hello World!!");
		System.out.println("\nvariaveis em java\n");
		
		int y = 32;
		int x = 35;
		System.out.println(y + x);
		
		double a = 10.35784;
		
		System.out.printf("%.2f\n",a);
		System.out.printf("%.3f\n",a);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n",a);
		System.out.println("\nConcatenar no Java\n");
		
		System.out.println("Resultado = "+ x + " Metros");
		
		System.out.println("\nConcatenar varias variáveis\n");
		
		String nome = "Denerval S pelizario";
		int idade = 35;
		double salario = 38.000;
		
		System.out.printf("%s tem %d anos e ganha R$ %.3f mil reais /n", nome, idade, salario);
		
		
				
	}

}
