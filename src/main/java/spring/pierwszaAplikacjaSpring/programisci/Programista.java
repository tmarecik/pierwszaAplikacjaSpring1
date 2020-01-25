package spring.pierwszaAplikacjaSpring.programisci;

import org.springframework.stereotype.Component;

public class Programista {

    private CaffeMashin caffeMashin;
    private Komputer komputer;

    public Programista(CaffeMashin caffeMashin, Komputer komputer) {
        this.caffeMashin = caffeMashin;
        this.komputer = komputer;
    }




}
