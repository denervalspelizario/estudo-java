package entities;

public class Product {
	
	public String name;   // 3 - criando as atibuicoes e metodos(ou funcoes) -- 
	public double price;
	public int quantity;
	
	public double totalValueInStock() {  // retorna o total preco * quantidade fica de olho na sintaxe
		
		return price * quantity;
			
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  // o this quantity referencia o quantity primeiro que contem todas as unidade  o segundo é oq vai adicionar ao estoque ja existente
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;  // o this quantity referencia o quantity primeiro que contem todas as unidade  o segundo é oq vai remover ao estoque ja existente
	}
	
	public String toString() {  // faco o print do jeito que eu quero aqui na base da clas com o toString
		return "product "
			   + name             // agora toda vez que a product for chamada ela vai imprimir os dados desse jeito
			   + ", $ "              
			   + price
			   + ", "
			   + quantity
			   + " units, Total: $ "
			   + totalValueInStock();
	}
	
}
