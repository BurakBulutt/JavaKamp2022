
public class DortIslem {
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static int cikar(int sayi1,int sayi2) {
		return sayi1-sayi2;
	}
	public static int carp(int sayi1,int sayi2) {
		return sayi1*sayi2;
	}
	public static int böl(int sayi1,int sayi2) throws Exception {
		if(sayi2 == 0)
			throw new Exception("Payda 0 olamaz");
		else
			return sayi1/sayi2;
	}

}
