package ads.poo;
import java.util.Random;
public class Conta {

    private String nome;
    private String id;
    private double saldo;
    private Random random = new Random();

    public Conta(double saldo, String nome) {
        this.setId();
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public Conta() {
        this.setId();
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void setId() {
        int n = random.nextInt(100000);
        this.id = String.format("%05d", n);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public boolean sacar(double valor){
        if (valor>this.saldo){

            return false;
        } else {
            this.saldo = this.saldo+valor;
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor>=0){
            this.saldo = this.saldo+valor;
            return true;

        } else {
            return false;
        }
    }

    public String toString(){
        return String.format("""
                Conta: %d
                Titular: %s
                Saldo: %.2f
                """);
    }

}
