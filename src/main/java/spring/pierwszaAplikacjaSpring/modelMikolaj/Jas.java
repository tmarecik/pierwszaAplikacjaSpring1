package spring.pierwszaAplikacjaSpring.modelMikolaj;

import org.springframework.stereotype.Component;

@Component
public class Jas {

    public Jas(Ciastko ciastko){
        if(ciastko.uzgryz()){
            System.out.println("Jas Mniam");
        } else {
            System.out.println("Jas: już ugryzione");
        }

    }

}
