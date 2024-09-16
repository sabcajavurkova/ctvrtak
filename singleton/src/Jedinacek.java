import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

// @ = anotace
@Setter
@ToString
public class Jedinacek {
    private static Jedinacek singletonInstance;
    @Getter
    private static String stav;;

    private Jedinacek() throws IOException {
        stav = new String(Files.readAllBytes(Paths.get("myapp.cfg"))).trim();
    }

    public static Jedinacek getInstance() throws IOException {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void setState(String s) throws FileNotFoundException {
        if(s == null){
            throw new RuntimeException("Stav nesmi byt null");
        }
        stav = s;
        try (PrintWriter out = new PrintWriter("myapp.cfg")) {
            out.println(stav);
        }
    }
    public static String getState(){
        return stav;
    }

}