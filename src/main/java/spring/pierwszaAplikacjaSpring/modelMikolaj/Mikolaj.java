package spring.pierwszaAplikacjaSpring.modelMikolaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mikolaj {

    private Dziecko mateusz;
    private Dziecko klaudia;
    private Dziecko bartek;


    public Mikolaj(@Qualifier("lobuz") Dziecko mateusz, @Qualifier("zlosnica") Dziecko klaudia, @Qualifier("milczek") Dziecko bartek) {
        this.mateusz = mateusz;
        this.klaudia = klaudia;
        this.bartek = bartek;
    }

    @Autowired
    public void setDlaMateusza(Prezent dlaMateusza){
        this.mateusz.daj(dlaMateusza);
    }

    @Autowired
    public void setDlaKlaudi(Prezent dlaKlaudi){
        this.klaudia.daj(dlaKlaudi);
    }

    @Autowired
    public void setDlaBartka(Prezent dlaBartka){
        this.bartek.daj(dlaBartka);
    }

}
