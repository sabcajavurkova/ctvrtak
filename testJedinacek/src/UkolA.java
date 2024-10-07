import java.io.IOException;
import java.math.BigInteger;

public class UkolA {
    public void metodaA(int n) throws IOException {
        BigInteger i = BigInteger.valueOf(n);

        while(i.compareTo(BigInteger.ONE) > 0) {
            if (i.isProbablePrime(1)) {
                UkolB b = new UkolB(n);
            }
            i = i.subtract(BigInteger.ONE);
        }

        Jedinacek j = Jedinacek.getInstance();
        j.increaseCounter();
    }
}
