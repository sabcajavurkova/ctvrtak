package http.cz.gyarab.prg.moje_webovka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@Controller
@SpringBootApplication
public class MojeWebovkaApplication {

	// funkce se stara o toto url
	@GetMapping("/faktorial")
	// bere param cislo
	// parametr x do cesty dam takhle: /faktorial?cislo=x
	public String faktorial(@RequestParam(required = false) Integer cislo, Model model){
		model.addAttribute("cislo", cislo);

		BigInteger f = BigInteger.valueOf(1);
		for (int i = 1; i <= cislo; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		model.addAttribute("faktorial", f);

		return "faktorial";
	}

	public static void main(String[] args) {
		SpringApplication.run(MojeWebovkaApplication.class, args);
	}

}
