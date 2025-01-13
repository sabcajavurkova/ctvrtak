import java.io.Serializable;
import java.util.*;

public class Vrchol implements Serializable {
    private final String jmeno;
    private Set<Vrchol> sousedi;

    public Vrchol(String jmeno) {
        this.jmeno = jmeno;
        this.sousedi = new HashSet<>();
    }

    public void pridejSouseda(Vrchol v) {
        sousedi.add(v);
    }

    public boolean jeSousedem(Vrchol v) {
        return sousedi.contains(v);
    }

    public boolean existujeCestaDo(Vrchol v) {
        Set<Vrchol> navstivene = new HashSet<>();
        return dfs(v, navstivene);
    }

    private boolean dfs(Vrchol cil, Set<Vrchol> navstivene) {
        if (this == cil) return true;
        navstivene.add(this);

        for (Vrchol soused : sousedi) {
            if (!navstivene.contains(soused) && soused.dfs(cil, navstivene)) {
                return true;
            }
        }
        return false;
    }

}