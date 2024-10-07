import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        UkolA a = new UkolA();

        a.metodaA(sc.nextInt());

        Jedinacek j = Jedinacek.getInstance();
        System.out.println(j.getCounter());
    }
}