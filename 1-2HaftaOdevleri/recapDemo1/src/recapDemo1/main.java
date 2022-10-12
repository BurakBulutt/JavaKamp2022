package recapDemo1;

public class main {

	public static void main(String[] args) {
		int sayi1 = 36;
		int sayi2 = 41;
		int sayi3 = 30;
		int enbüyük;

		if (sayi1 > sayi2 && sayi1 > sayi3)
			enbüyük = sayi1;
		else if (sayi2 > sayi1 && sayi2 > sayi3)
			enbüyük = sayi2;
		else
			enbüyük = sayi3;

		System.out.println("En büyük sayi : " + enbüyük);
	}

}
