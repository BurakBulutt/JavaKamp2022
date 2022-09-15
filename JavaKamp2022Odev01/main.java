package Baslangıc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int sayi1,sayi2,secim;
		String[] math = {"Toplama","Çıkarma","Bölme","Çarpma"};
		boolean durum = true;
		Scanner in =new Scanner(System.in);
		
		System.out.println("İşlem Listesi");
		for(int i = 0;i<math.length;i++) {
			System.out.println(i + " - " + math[i]);
		}
		
		System.out.println("Sayıları Giriniz");
		sayi1=in.nextInt();
		sayi2=in.nextInt();
		
	do {
		System.out.println("Bir İşlem Seçin");
		secim = in.nextInt();
		
		switch(secim) {
		case 0 :
			int toplam = sayi1 + sayi2;
			System.out.println("SONUC : " +toplam);
			durum = false;
			break;
		case 1 :
			int fark = sayi1 - sayi2;
			System.out.println("SONUC : " +fark);
			durum = false;
			break;
		case 2 :
			int carpım = sayi1*sayi2;
			System.out.println("SONUC : " + carpım);
			durum = false;
			break;
		case 3 :
			int bölüm = sayi1/sayi2;
			System.out.println("SONUC : " + bölüm);
			durum = false;
			break;
		default :
			System.err.println("HATALI İŞLEM");
			break;
		}
		
	}while(durum);	
		in.close();
	}

}
