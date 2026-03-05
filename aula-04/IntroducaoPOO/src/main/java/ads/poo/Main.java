package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Lampada a = new Lampada();
        Lampada b = new Lampada();

        a.apertarInterruptor();

        System.out.println(a.apertarInterruptor());
        System.out.println(b.apertarInterruptor());
        System.out.println(a.apertarInterruptor());
        System.out.println(b.apertarInterruptor());

        }
    }
