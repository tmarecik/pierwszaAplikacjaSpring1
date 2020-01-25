package spring.pierwszaAplikacjaSpring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kierowca {

//    @Autowired
    Kluczyki kluczyki;
//
//    @Autowired
    PrawoJazdy prawoJazdy;

    public Kierowca(Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
        this.kluczyki = kluczyki;
        this.prawoJazdy = prawoJazdy;
    }

    // tak jak w samochodzie do zadeklarowania zaleznosci pomiedzy obiekrtami najlepiej wykorzystac konstruktor
    //    @Autowired
//    public void setKluczyki(Kluczyki kluczyki) {
//        this.kluczyki = kluczyki;
//    }
//
//    @Autowired
//    public void setPrawoJazdy(PrawoJazdy prawoJazdy) {
//        this.prawoJazdy = prawoJazdy;
//    }
}
