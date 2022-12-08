
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
		
		
		String s05 = original.substring(2, 9); /* pega do elemento 2 em diante (a segunda conta do 0 a 9 * no caso   0, 1 nao aparecem por causa da pimeira condicao no caso 2)*/
		System.out.println("substring - " + s05);                                             
		System.out.println("\n---------\n");
		
		
		String s06 = original.replace("a", "x"); /* troca a minúsculo por x minúsculo*/
		System.out.println("replace - " + s06);
		System.out.println("\n---------\n");
		
		
		
		String s07 = original.replace("abc", "xy"); /* troca abc minúsculo por xy minúsculo*/
		System.out.println("replace - " + s07);
		System.out.println("\n---------\n");
		
		
		int s08 = original.indexOf("bc");       /* qual é a primeira posicao do substring bc*/
		System.out.println("indexOf - " + s08);
		System.out.println("\n---------\n");
		
		int s09 = original.lastIndexOf("bc");       /* qual é a ultima posicao do substring bc*/
		System.out.println("lastIndexOf - " + s09);
		System.out.println("\n---------\n");
		
		
		String s = "potato apple lemon";
		
		String [] vect = s.split(" ");/* tranforma a string em um objeto e separa no caso por ESPAÇO mas pode ser por virgula ou outro caracter*/
		System.out.println(vect[0]);/* pega posicao 0 da sting que virou objeto*/
		System.out.println(vect[1]);/* pega posicao 1 da sting que virou objeto*/
		System.out.println(vect[2]);/* pega posicao 2 da sting que virou objeto*/
		
	}

}
