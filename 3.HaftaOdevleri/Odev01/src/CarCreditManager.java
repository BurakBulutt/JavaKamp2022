public class CarCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Araba Kredisi Hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("Kredi verildi");

    }
}
