import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Vlakno v = new Vlakno("v");
        Jedinacek j = Jedinacek.getInstance();

        v.start();
        Thread.sleep(2000);
        j.setState("Pokračuju");
        Thread.sleep(2000);
        j.setState("Ještě dááál pokračuju");
        Thread.sleep(2000);
        j.setState("Konec");

    }
}