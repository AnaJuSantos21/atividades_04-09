package curso04_09_enum;

public class EnumMesesExemplo {

	public static void main(String[] args) {
		
		for (Mes mes : Mes.values()) {
			System.out.println("*******");
			System.out.println(mes);
		}

	}

}
