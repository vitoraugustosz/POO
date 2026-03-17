package ads.poo;

public class Carro {

    private String modelo;
    private double velAtual;
    public double velMax;

    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MIN_GERAL = 0;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velMax = VEL_MAX_MODELOS;
    }

    public Carro(String modelo, double velMax) {
        this.velMax = velMax;
        this.modelo = modelo;
    }

    public void acelerar(double aceleracao){
        velAtual += aceleracao;
        velAtual = Math.min(velMax, velAtual);
    }

    public void frear(double freio){
        velAtual -= freio;
        velAtual = Math.max(velAtual, 0);
    }

    public double getVelAtual(){
        return velAtual;
    }


    public void setVelMax(double vm) {
        velMax = vm;
    }
}
