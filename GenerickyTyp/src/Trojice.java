public class Trojice<A extends Comparable<A>> {

    private A arg1;
    private A arg2;
    private A arg3;

    public Trojice(A arg1, A arg2, A arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    @Override
     public String toString(){
        return ("a = " + arg1 + ", b = " + arg2 + ", c = " + arg3);
     }

     public void setAll(A a){
         arg1 = arg2 = arg3 = a;
     }

     public A getFirst(){
        return arg1;
     }

     public A dejMiNejmensi(){
        // String i Integer maji compareTo funkci .. bude fungovat
        // ale napriklad typ UserProfile ne, jenom tridu typu Object .. chcme nejake omezeni pro typ A - EXTENDS COMPARABLE s A
        if(arg1.compareTo(arg2) < 0 && arg1.compareTo(arg3) < 0){
            return arg1;
        } else if(arg2.compareTo(arg1) < 0 && arg2.compareTo(arg3) < 0){
            return arg2;
        }
        return arg3;
     }



    public static void main(String[] args) {
        Trojice<String> t = new Trojice<>("C", "B", "A");
        System.out.println(t);
        System.out.println("Nejmensi: " + t.dejMiNejmensi());

        Trojice<Integer> t1 = new Trojice<>(3, 2, 1);
        System.out.println(t1);
        System.out.println("Nejmensi: " + t1.dejMiNejmensi());

        System.out.println();
        String f = t.getFirst();
        int f1 = t1.getFirst();
        System.out.println("Prvni z t: " + f + ", prvni z t2: " + f1);

        t.setAll("X");
        t1.setAll(0);
        System.out.println(t);
        System.out.println(t1);
    }
}