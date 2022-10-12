public class Customer {
    private int Id;
    private  String city;



    public Customer(){
        System.out.println("Müşteri oluşturuldu");
    }
    public Customer(int id,String city) {
        super();
        Id = id;
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
