package sesliHarfler;

public class main {

	public static void main(String[] args) {
		char harf = 'E';
		

		switch (harf) {
			case 'A' :
			case 'I' :
			case 'O' :
			case 'U' :
				System.out.println("Kalın Sesli harf");
				break;
			case 'E' :
			case 'İ' :
			case 'Ö' :
			case 'Ü' :
				System.out.println("İnce Sesli harf");
				break;
			default :
				System.out.println("Geçersiz giriş");

		}

	}

}
