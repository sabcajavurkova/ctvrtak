import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tovarna pobockaTovarny = new TovarnaSabinov();
//        Tovarna pobockaSpecialTovarny = new TovarnaFusinkov(); ...
        Scanner sc = new Scanner(System.in);
        ArrayList<Tvar> nakupniKosik = new ArrayList<>();

        for (;;) {
            String poptavka = sc.nextLine();
            if (poptavka.equalsIgnoreCase("konec")) {
                break;
            }

            try {
                Tvar t = pobockaTovarny.vyrobTvar(poptavka);
                nakupniKosik.add(t);
            } catch (Exception e) {
                System.out.println("Neznamy produkt.");
            }
        }

        for (Tvar t: nakupniKosik) {
            System.out.println(t.namalujSe());
            System.out.println("Moje plocha: " + t.dejPlochu());
            System.out.println();
        }
    }
}