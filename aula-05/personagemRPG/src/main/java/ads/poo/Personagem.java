package ads.poo;
import java.util.Random;

public class Personagem {

    private int classe;
    private String raca;
    private double hp;
    private int forca;
    private int inteligencia;
    private int destreza;
    private int mana;
    private Random r = new Random(20);

    //atacar fisicamente
    //soltar poderzinho

    public void setRaca(String x){

        raca.equalsIgnoreCase(x);


    }

    public double getHp() {
        int dado = r.nextDouble();
        hp = dado +
        return hp;
    }
}
