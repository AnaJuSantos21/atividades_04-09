package curso04_09_enum;

public class PrincipalProdutos {

	public static void main(String[] args) {
		System.out.println("-----MERCADO-----");
		for (Produtos produtos : Produtos.values()) {
			System.out.println("*******");
			System.out.println(produtos);
		}

	}

}
