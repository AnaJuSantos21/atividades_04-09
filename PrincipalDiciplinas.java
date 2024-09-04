package curso04_09_enum;

public class PrincipalDiciplinas {

	public static void main(String[] args) {
		for (Diciplinas disciplinas : Diciplinas.values()) {
			System.out.println("*******");
			System.out.println(disciplinas);
		}

	}

}
