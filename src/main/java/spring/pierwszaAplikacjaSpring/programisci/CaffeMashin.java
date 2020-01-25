package spring.pierwszaAplikacjaSpring.programisci;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
public class CaffeMashin {

    public static int i=0;

    public CaffeMashin() {
        System.out.println("Ekspres do kawy: " + i++);
    }
}
