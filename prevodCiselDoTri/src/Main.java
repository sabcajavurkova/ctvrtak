import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cislo = sc .nextInt();
        StringBuilder obracenyVysledek = new StringBuilder();


        while(cislo != 0 ){

            int zbytek = cislo % 3;
            cislo /= 3;
            obracenyVysledek.append(zbytek);
        }

        // Zrcadlovy vysledek
        System.out.println("Vysledek: " + obracenyVysledek);


    }
}