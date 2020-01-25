package spring.pierwszaAplikacjaSpring.configurationProgrmisci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import spring.pierwszaAplikacjaSpring.programisci.CaffeMashin;
import spring.pierwszaAplikacjaSpring.programisci.Komputer;
import spring.pierwszaAplikacjaSpring.programisci.Programista;

@Configuration
public class ConfigProgramisci {

    @Bean
    public Programista programista(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }

    @Bean
    public Programista programista1(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }

    @Bean
    public Programista programista2(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }
    @Bean
    public Programista programista3(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }
    @Bean
    public Programista programista4(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }
    @Bean
    public Programista programista5(CaffeMashin caffeMashin, Komputer komputer){
        return new Programista(caffeMashin, komputer);
    }
}
