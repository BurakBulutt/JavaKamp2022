package loopDemo;

public class main {
	public static void main(String[] args) {
		// for
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println(" For Döngü Bitti");

		// while
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti");

		// Do-while 
		int j = 1;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("D0-While Döngüsü Bitti");

	}

}
