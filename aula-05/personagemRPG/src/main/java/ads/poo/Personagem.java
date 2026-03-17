package ads.poo;
import java.util.Random;

public class Personagem {

    private int classe;
    private String raca; // humano, elfo, goblin, anao, halfling, orc
    private double hp;
    private int forca;
    private int inteligencia;
    private int destreza;
    private int mana;
    private static final Random DADO = new Random(20);


    public Personagem(String raca, int classe) {
        this.classe = classe;
        this.raca = raca; // HP, força, mana, inteligencia, destreza
    }

    public void setter(){
        int[] stats = new int[5];
        switch (raca){
            case (raca.equalsIgnoreCase("goblin")->
                stats = [25, 15, 5, 15, 50];

        }
    }

}
