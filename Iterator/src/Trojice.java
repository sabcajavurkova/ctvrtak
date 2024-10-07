// Da se vygooglit 'java api Iterable'.. najde mi ty metody, ktere teto tride pripisuje
// Iterable X Iterator
// <String>, protoze  implementujeme for each
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

//    public boolean hasNext(){
//        return pocet < 3;
//    }
//
//    public String next(){
//        switch(pocet++){
//            case 0: return a;
//            case 1: return b;
//            default: return c;
//        }
//    }

//    public IteratorTrojice dejMiIterator(){
////        IteratorTrojice it = new IteratorTrojice();
////        it.trojice = this;
//        return new IteratorTrojice(this);
//    }

    public IteratorTrojice iterator(){
//        IteratorTrojice it = new IteratorTrojice();
//        it.trojice = this;
        return new IteratorTrojice(this);
    }



    public static void main(String[] args) {
        Trojice t = new Trojice("po", "ut", "ne");


        for (String s1: t){
            for (String s2: t){
                System.out.println(s1 + " " + s2);
            }
        }
        System.out.println();

        // Budeme dvakrat iterovat.. vytvorime dva iteratory
        IteratorTrojice it = t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

//        IteratorTrojice it2 = t.dejMiMujIterator();
        IteratorTrojice it2 = t.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

//        while(t.hasNext()){
//            System.out.println(t.next());
//        }

    }
}
