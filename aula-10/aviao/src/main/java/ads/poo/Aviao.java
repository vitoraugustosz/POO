package ads.poo;
import java.util.ArrayList;

public class Aviao {

    private int tripulacao;
    private int passageiros;
    private int tanque;
    private boolean ligado;
    private ArrayList<Motor> motores;

    public Aviao(int numTripulacao, int numPassageiros, int capacidadeTanque, int numeroDeMotores, String tipoDeMotor){
        this.tripulacao = numTripulacao;
        this.passageiros = numPassageiros;
        this.tanque = capacidadeTanque;
        this.motores = new ArrayList<>();

        for (int i = 0; i < numeroDeMotores; i++) {
            Motor novoMotor = new Motor(tipoDeMotor);
            motores.add(novoMotor);
        }
    }

    public void ligar() {
        ligado = true;

        motores.forEach(motor -> {
            if (!motor.isLigado()) {
                motor.ligarDesligar();
            }
        });
    }

    public void desligar() {
        ligado = true;
        motores.forEach(motor -> {
            if (motor.isLigado()) {
                motor.ligarDesligar();
            }
        });
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean ligarMotor(int posicaoMotor) {
        if (posicaoMotor > motores.size()) {
            return false;
        } else {
            motores.get(posicaoMotor-1).ligarDesligar();
            return motores.get(posicaoMotor).isLigado();
        }
    }



    public int getTanque() {
        return tanque;
    }

    public int getPassageiros() {
        return passageiros;
    }


    public int getTripulacao() {
        return tripulacao;
    }


}
