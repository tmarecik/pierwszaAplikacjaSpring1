package spring.pierwszaAplikacjaSpring;

/* Conabla pozwala na klonowanie obiektów*/
public class Figura implements Cloneable{

    private static final Figura FIGURA = new Figura();

    private int a;
    private int b;

    private Figura(){    //prywatny konstruktor powoduje  ze nie można utworzyc więcej niż jednej instancji!!

    }

    public static Figura kwadrat(int a){
        try {
            Figura kwadrat = (Figura) FIGURA.clone();
            kwadrat.a = a;
            kwadrat.b = a;
            return kwadrat;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static Figura prostokat(int a, int b){
        try {
            Figura prostokat = (Figura) FIGURA.clone();
            prostokat.a = a;
            prostokat.b = b;
            return prostokat;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int pole(){
        return this.a*this.b;  //to jest równoznaczne z "return a*b" bez "this"
    }



}
