package switchDemo;

public class main {

	public static void main(String[] args) { // ctrl shift + F ile kodu düzenleyebilirsin
												
		char grade = 'A';

		switch (grade) {
			case 'A' :
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B' :
				System.out.println("Çok Güzel : Geçtiniz");
				break;
			case 'C' :
				System.out.println(" Güzel : Geçtiniz");
				break;
			case 'D' :
				System.out.println("Sorumlu : Geçtiniz");
				break;
			case 'F' :
				System.out.println("Kaldınız : Geçtiniz");
				break;
			default :
				System.out.println("Geçersiz not girdiniz");

		}

	}

}
