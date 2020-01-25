package spring.pierwszaAplikacjaSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.pierwszaAplikacjaSpring.modelMikolaj.Prezent;

@Configuration
public class MikolajKonfiguration {

    @Bean                            //
    public Prezent dlaMateusza(){
        return new Prezent("dron");
    }

    @Bean
    public Prezent dlaKlaudi(){
        return new Prezent("lalka");
    }

    @Bean
    public Prezent dlaBartka(){
        return new Prezent("klocki");
    }
}

