package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

       /* Lampada a = new Lampada();
        Lampada b = new Lampada();

        a.apertarInterruptor();

        System.out.println(a.apertarInterruptor());
        System.out.println(b.apertarInterruptor());
        System.out.println(a.apertarInterruptor());
        System.out.println(b.apertarInterruptor());
        */

        Caneta faberCastell = new Caneta();

        faberCastell.setCor("Azul");
        faberCastell.setNivelTinta(0.001);
        faberCastell.abrirTampa();

        System.out.println(faberCastell.getCor());
        System.out.println(faberCastell.getNivelTinta());
        System.out.println(faberCastell.desenhar(1,1,1,2));
        System.out.printf("%.2f", faberCastell.getNivelTinta());



        }
    }
