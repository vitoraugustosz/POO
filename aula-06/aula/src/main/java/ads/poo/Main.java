package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Carro golRebaixado = new Carro("Gol");


        System.out.println(golRebaixado.velMax);
        System.out.println(golRebaixado.getVelAtual());

        Pessoa motorista = new Pessoa("Yale Medellin", "12345678910", "xaulin.matador.de.porco@gmail.com");

        System.out.println(motorista.getNome() + " " + motorista.getCpf());

        IO.println(motorista.toString());
    }
}
