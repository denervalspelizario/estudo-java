
public class MainString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		String s01 = original.toLowerCase(); /* deixa tudo letra minuscula */
		System.out.println("toLowerCase - " + s01);
		System.out.println("\n---------\n");
		
		
		String s02 = original.toUpperCase(); /* deixa tudo letra maiuscula */
		System.out.println("toUpperCase - " + s02);
		System.out.println("\n---------\n");
		
		
		
		String s03 = original.trim(); /* elimina os espaços DOS CANTOS DA STRING*/
		System.out.println("trim - " + s03);
		System.out.println("\n---------\n");
		
		
		String s04 = original.substring(2); /* pega do elemento 2 em diante (lembrando que começa posicao 0)*/
		System.out.println("substring - " + s04);
		System.out.println("\n---------\n");
		
		
		String s05 = original.substring(2, 9); /* pega do elemento 2 em diante (lembrando que começa posicao 0)*/
		System.out.println("substring - " + s05);
		System.out.println("\n---------\n");
		
	}

}
