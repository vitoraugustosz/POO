package ads.poo;

public class Motor {
    private int hp;
    private int cilindros;
    private int giroAtual;

    public Motor() {
        this.hp = 99999;
        this.cilindros = 24;

    }

    public void acelerar(int v){
        giroAtual = giroAtual++;
    }
}
