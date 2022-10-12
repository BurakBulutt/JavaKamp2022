package classesWithAttributes;

public class main {
	public static void main(String[] args) {
		Product product1 = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");

		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		System.out.println(product1.getKod());
		

	}

}
/*	product1.setName("Laptop");
product1.setId(1);
product1.setDescription("Asus LAPTOP");
product1.setPrice(5000);
product1.setStockAmount(3); */