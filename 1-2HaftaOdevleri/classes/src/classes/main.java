package classes;

public class main {

	public static void main(String[] args) {
		CustomerManager customermanager = new CustomerManager();
		CustomerManager customermanager2 = new CustomerManager();
		customermanager.add();
		customermanager.remove();
		customermanager.update();
		customermanager = customermanager2;
		
	}

}
