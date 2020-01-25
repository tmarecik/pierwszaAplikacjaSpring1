package spring.pierwszaAplikacjaSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.pierwszaAplikacjaSpring.model.Kierowca;
import spring.pierwszaAplikacjaSpring.model.PrawoJazdy;
import spring.pierwszaAplikacjaSpring.model.Samochod;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestConfiguration {

//    @Bean                                   //uwaga zeby nie bylow 2 miejscach tworzenia obiektu
//    public List<Samochod> samochod() {
//        List<Samochod> out = new ArrayList<>();
//        for(int i=0; i<5; i++)
//            out.add(new Samochod());
//        return out;
//    }
//
//    @Bean
//    public PrawoJazdy prawoJazdy(){
//        return new PrawoJazdy();
//    }
//
//    @Bean
//    public Kierowca kierowca(){
//        return new Kierowca();
//    }


}
