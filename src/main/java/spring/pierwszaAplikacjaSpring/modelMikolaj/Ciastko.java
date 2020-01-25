package spring.pierwszaAplikacjaSpring.modelMikolaj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)
@Component
public class Ciastko {

    private boolean ugryzione = false;

    public boolean uzgryz(){
        if(ugryzione) {
            return false;
        }

        System.out.println("Chrumm");
        ugryzione = true;
        return true;
    }

}
