package spring.pierwszaAplikacjaSpring.modelMikolaj;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor   //spring automatycznie generuje konstruktor z wszystkimi argumentami
public class Prezent {

    private String nazwa;

}
