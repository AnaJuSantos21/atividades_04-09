package curso04_09_enum;

public class PrincipalNomes {

	public static void main(String[] args) {
		for (Nomes nomes : Nomes.values()) {
			System.out.println("*******");
			System.out.println(nomes);
		}

	}

}