package ads.poo;

public class Motor {

    private String tipo;
    private int potencia;
    private boolean ligado;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public boolean ligarDesligar(){
        ligado = !ligado;
        return ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
}
