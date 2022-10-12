public class MilitaryCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Asker Kredisi Hesaplandı");

    }

    @Override
    public void save() {
        System.out.println("Kredi eklendi");
    }
}
