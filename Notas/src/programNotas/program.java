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
		notasInput.nota2 = inputDado.nextDouble();
		notasInput.nota3 = inputDado.nextDouble();

		String aprovacaoAluno = notasInput.aprovacaoAluno();

		
		
	}

}
