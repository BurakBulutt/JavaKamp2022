package Core;

public class DataBaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
