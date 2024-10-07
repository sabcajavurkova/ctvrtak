import java.io.IOException;

public class UkolB {
    public UkolB(int n) throws IOException {
        for(int i = n; i > 0; i = i/2) {
            metodaB(i);
        }
    }

    public void metodaB(int n) throws IOException {
        if (n > 2) {
            metodaC();
        }

        Jedinacek j = Jedinacek.getInstance();
        j.increaseCounter();
    }

    public void metodaC() throws IOException {
        Jedinacek j = Jedinacek.getInstance();
        j.increaseCounter();
    }
}
