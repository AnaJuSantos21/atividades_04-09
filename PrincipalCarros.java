package curso04_09_enum;

public class PrincipalCarros {

	public static void main(String[] args) {
		for(Carros carros : Carros.values()) {
			System.out.println("*******");
			System.out.println(carros);
		}

	}

}
