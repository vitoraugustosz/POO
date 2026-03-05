package ads.poo;

public class Lampada {

    //Atributos
    private boolean ligada;

    // Métodos
    boolean apertarInterruptor(){
        if (ligada){
            ligada= false;
            return ligada;
        } else {
            ligada = true;
            return ligada;
        }

    }

    boolean isLigada(){
        return ligada;
    }




}
