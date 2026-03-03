package ads.poo;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vou pensar em um número de 1 a 10...");
        System.out.println("E você deve advinhar o número que pensei");
        System.out.println("Que número estou pensando?");

        Random r = new Random();
        int num;
        do {
            //recebe entrada
            num = sc.nextInt();
        }while (num != r);

        sc.close();

    }
}
