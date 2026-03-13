package ads.poo;

public class Contador {

    private int valorAtual;
    private boolean diminuir = false;

    public void setValorAtual(int in) {
         valorAtual = in;
    }

    public int getValorAtual() {
        return valorAtual;
    }

    public void clicar(){
        valorAtual = (diminuir)? valorAtual - 1 : valorAtual + 1;
    }

    public void setDiminuir(boolean x) {
        diminuir = x;
    }
}
