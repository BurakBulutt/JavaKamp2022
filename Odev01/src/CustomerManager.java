public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer,ICreditManager iCreditManager) {
        this.iCreditManager = iCreditManager;
        this.customer = customer;
    }

    public void Save(){
        System.out.println("Müşteri eklendi : " );
    }
    public void Delete(){
        System.out.println("Müşteri silindi : ");
    }
    public void GiveCredit(){
        iCreditManager.calculate();
        System.out.println("Kredi Verildi : ");
    }
}
