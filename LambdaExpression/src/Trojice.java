import java.util.Iterator;

public class Trojice implements Iterable<String> {
    String a;
    String b;
    String c;
    int pocet;

    public Trojice(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        pocet = 0;
    }

    // uvnitr tridy definujeme tento iterator
//    public class InterniIterator implements Iterator<String> {
//        int pocet;
        // Nemusim si ji pamatovat, jsem trojice
//        Trojice trojice;

        // ani konstruktor
//        public InterniIterator(Trojice trojice) {
//            this.trojice = trojice;
//        }

//        public boolean hasNext(){
//            return pocet < 3;
//        }
//
//        public String next(){
//            switch(pocet++){
//                // jsem trojice; moje a b c
//                case 0: return a;
//                case 1: return b;
//                default: return c;
//            }
//        }
//
//    }

    // tento interface znaji i ostatni tridy.. InterniIterator muzu pouzivat jen interne, porotze je definovany within
    public Iterator<String> iterator(){
        // zmizi this.. neni zde konstruktor
//        return new InterniIterator();
        return new Iterator<String>() {
            int pocet;

            public boolean hasNext(){
                return pocet < 3;
            }

            public String next(){
                switch(pocet++){
                    // jsem trojice; moje a b c
                    case 0: return a;
                    case 1: return b;
                    default: return c;
                }
            }
        };
    }


    public static void main(String[] args) {
        Trojice t = new Trojice("po", "ut", "ne");

        // vypise vsechny double kombinace
        for (String s1: t){
            for (String s2: t){
                System.out.println(s1 + " " + s2);
            }
        }
        System.out.println();

        // Budeme dvakrat iterovat.. vytvorime dva iteratory
        Iterator<String> it = t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        Iterator<String> it2 = t.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
