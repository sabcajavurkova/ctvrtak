import java.io.IOException;
import java.util.Objects;

public class Vlakno extends Thread{
    // rekne si o jedinacka  a vypise jeho status
    // to dela kazdou sekundu

    public Vlakno(String s) {
        super(s);
    }

    @Override
    public void run() {
        String stav = null;
        Jedinacek j;
        try {
            j = Jedinacek.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while(!Objects.equals(stav, "Konec")){
            stav = j.getState();
            System.out.println(stav);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
