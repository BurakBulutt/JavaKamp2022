public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();

        CustomerManager customerManager = new CustomerManager(customer,new MilitaryCreditManager());
        customerManager.GiveCredit();






    }
}