package sayiBulma;

public class main {
	public static void main(String[] args) {
		int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
		boolean durum = false;
		int aranacak = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				durum = true;
				break;
			}

		}
		if (durum)
			System.out.println("Sayi Bulundu");
		else
			System.out.println("Sayi Bulunamadı");

	}

}
