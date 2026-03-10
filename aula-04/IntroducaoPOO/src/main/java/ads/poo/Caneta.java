package ads.poo;

public class Caneta {

    private String cor;
    private boolean aberta;
    private double nivelTinta;

    public void abrirTampa(){
        aberta = true;
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setNivelTinta(double ml){
        nivelTinta = ml;
    }

    public String getCor(){
        return cor;
    }

    public boolean isAberta(){
        return aberta;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public String desenhar (int x1,int x2, int y1, int y2) {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double consumo = distancia*0.01;
        if (nivelTinta < (consumo)){
            return String.format("Não vai dar de escrever");
        } else {
            if (aberta) {


                nivelTinta -= distancia * 0.01;
                return String.format("Desenhei %.2f na cor %s", distancia, cor);

            } else {
                return String.format("A caneta está fechada, vai arranhar o quadro");
            }
        }
    }
}
