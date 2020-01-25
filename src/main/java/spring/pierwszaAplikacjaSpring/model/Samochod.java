package spring.pierwszaAplikacjaSpring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Samochod {

//    @Autowired    //taka definicja jest niepolecana lepiej przez setter
    private Kierowca kierowca;

//    @Autowired            //wstrzykije zaleznosci IoC!!!
    private Czesci kola;

//    @Autowired
    private Czesci silnik;

    // w przypadku kilku konstruktorow nalezy dolozyc @Autowired przy własniwym->rządanym konstruktorze
    public Samochod(Kierowca kierowca, Czesci kola, Czesci silnik){         //dziedziczenia dzialaja -> zamieniono typy w kola i w silnik (obie klasy implementuja intarface Czesci)
        this.kierowca = kierowca;
        this.kola = kola;
        this.silnik = silnik;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("HELLO WORD");
    }

    @PreDestroy     //tego na razie nie jesteśmy w stnie wykonać
    public void preDestroy(){
        System.out.println("HELLO WORD");
    }


    //deklarowanie zaleznosci pomiedzy obiektami!!!!
    //najprosciej przez konstruktor
//    @Autowired
//    public void setKierowca(Kierowca kierowca) {
//        this.kierowca = kierowca;
//    }
//
//
//    @Autowired
//    public void setKola(Kola kola) {
//        this.kola = kola;
//    }
//
//
//    @Autowired
//    public void setSilnik(Silnik silnik) {
//        this.silnik = silnik;
//    }
}
