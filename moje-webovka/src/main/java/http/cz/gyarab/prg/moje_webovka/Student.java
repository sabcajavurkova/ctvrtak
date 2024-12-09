package http.cz.gyarab.prg.moje_webovka;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity


public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String jmeno;
    private Integer vek;

    protected Student() { }

    public Student(String jmeno, Integer vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", jmeno='" + jmeno + '\'' +
                ", vek=" + vek +
                '}';
    }
}
