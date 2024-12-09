package http.cz.gyarab.prg.moje_webovka;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    //save(Student), findById(Long), findAll(), ...

//    List<Student> findByVek(Integer vek);
//    List<Student> findByJmenoAndVek(String jmeno, Integer vek);
}