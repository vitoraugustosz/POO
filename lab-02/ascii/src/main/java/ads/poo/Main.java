package ads.poo;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0 ){
            System.out.println("Não forneceu argumentos na linha de comando");
        }

        if (args[0].equalsIgnoreCase("triangulo") || args[0].equalsIgnoreCase("triângulo")){
            int tam = Integer.parseInt(args[1]);

            for (int i = 0; i < tam; i++) {
                System.out.print("*");
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }

            if (args[0].equalsIgnoreCase("triangulo") || args[0].equalsIgnoreCase("retângulo")){







        }



        }
    }

