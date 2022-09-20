
public class main {

	public static void main(String[] args) {
		int number1 = 1184;
		int number2 = 1210;
		int friend1 = 0;
		int friend2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0)
				friend1 = friend1 + i;
		}
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0)
				friend2 = friend2 + j;
		}
		if (friend1 == number2 && friend2 ==number1)
			System.out.println("Arkadaş sayıdırlar");
		else
			System.out.println("Arkadaş sayı değiller");

	}

}
