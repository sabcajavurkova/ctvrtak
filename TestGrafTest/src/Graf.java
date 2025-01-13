import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graf implements Serializable {
    private Map<String, Vrchol> vrcholy;

    public Graf(){
        vrcholy = new HashMap<>();
    }

    public Vrchol dejVrchol(String jmeno) {
        return vrcholy.computeIfAbsent(jmeno, Vrchol::new);
    }

    public void ulozGrafDoSouboru(String jmenoSouboru) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(jmenoSouboru))) {
            StringBuilder sb = new StringBuilder();
            vrcholy.forEach((key, value) -> {
                sb.append(key + " ");
            });
            String out = sb.toString();
            oos.writeObject(out);} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
