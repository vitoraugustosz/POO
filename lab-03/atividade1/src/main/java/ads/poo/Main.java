package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Ponto a = new Ponto(0,0);
        Ponto b = new Ponto(2,2);

        double distanciaAB = a.calcDistancia(b);
        System.out.println(distanciaAB);

        System.out.println("("+b.getX()+", "+b.getY()+")");
        System.out.println(b.toString());



    }
}
