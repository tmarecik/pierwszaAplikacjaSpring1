package spring.pierwszaAplikacjaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//@SpringBootApplication(scanBasePackages =  "spring.pierwszaAplikacjaSpring.programisci")  //tak definiujemy co konkretnie chcemy odplic(w przeciwnym razie uruchamia wszystko)
public class PierwszaAplikacjaSpringApplication {

	public static void main(String[] args) {
//        System.out.println(Kalkulator.getInstance().dodaj(2,2));
//        System.out.println(Figura.kwadrat(4).pole());
	    SpringApplication.run(PierwszaAplikacjaSpringApplication.class, args);

	}

}


