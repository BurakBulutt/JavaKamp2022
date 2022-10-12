
public class main {
	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Burak";
		String ogrenci3 = "Ahmet";
		String ogrenci4 = "Can";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Burak";
		ogrenciler[2] = "Ahmet";
		ogrenciler[3] = "Can";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("-------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
