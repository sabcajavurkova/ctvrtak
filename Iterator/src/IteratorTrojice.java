import java.util.Iterator;

public class IteratorTrojice implements Iterator<String> {
    int pocet;
    Trojice trojice;

    public IteratorTrojice(Trojice trojice) {
        this.trojice = trojice;
    }

    public boolean hasNext(){
        return pocet < 3;
    }

    public String next(){
        switch(pocet++){
            case 0: return trojice.a;
            case 1: return trojice.b;
            default: return trojice.c;
        }
    }

}
