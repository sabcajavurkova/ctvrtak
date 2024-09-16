public class Main {
    public static void main(String[] args) {
        Cislo c1 = new Cislo(1,3);
        Cislo c2 = new Cislo(2,4);

        Cislo c3 = secti(c1, c2);
        System.out.println("Nove cislo ma A: " + c3.getA() + " a cislo B: " + c3.getB());

    }

    private static Cislo secti(Cislo c1, Cislo c2){
        int vysledekA = c1.getA() + c2.getA();
        int vysledekB = c1.getB() + c2.getB();

        return new Cislo(vysledekA, vysledekB);
    }
}