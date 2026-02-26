package ads.poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o dia:");
        int dia = sc.nextInt();

        System.out.println("Entre com o mês:");
        String mes = sc.nextLine();
        String estacao;

        boolean passaVinte;

        passaVinte = (dia<=20)? false : true;

            if (mes.equalsIgnoreCase("janeiro") || mes.equalsIgnoreCase("março")) {
                estacao = "verão";
            } else if (passaVinte) {
                estacao = "verão";
            } else if


        System.out.println("#Saída");
        System.out.println(estacao);



    }
}
