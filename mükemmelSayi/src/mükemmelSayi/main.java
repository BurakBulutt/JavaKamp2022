package mükemmelSayi;

public class main {

	public static void main(String[] args) {
		int number = 6;
		int stack = 0;
		
		for(int i =1;i<=number;i++) {
			if(number % i == 0)
				stack = stack + i;
		}
		if(stack == 2*number)
			System.out.println("Mükemmel sayidir");
		else
			System.out.println("Mükemmel sayi değildir");

	}

}
