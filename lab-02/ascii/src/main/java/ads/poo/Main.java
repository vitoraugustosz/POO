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
        }

        if (args[0].equalsIgnoreCase("retangulo") || args[0].equalsIgnoreCase("retângulo")){
            
            int largura = Integer.parseInt(args[1]);
            int altura = Integer.parseInt(args[2]);
            
            // for para trabalhar de linha em linha
            for (int i = 0; i < altura; i++) {

                //se for a última ou primeira linha
                if (i == 0 || i == altura-1){
                    for (int j = 0; j < largura ; j++) {
                        System.out.print(". ");
                    }
                    System.out.println(""); // pula linha
                }

                else { // se for as linhas do meio (vazadas)

                    System.out.print(".");

                    for (int j = 0; j < largura; j++) {
                        System.out.print(" ");
                    }


                    if (largura>=5) {//ajusta o número de espaços de acordo com o número de colunas para fechar o desenho
                        for (int j = 0; j < largura-3; j++) {
                         System.out.print(" ");   
                        }
                    }

                    System.out.println(".");
                }
            }
        
        }

        if (args[0].equalsIgnoreCase("losango")){

            /*
                *
              * * *
            * * * * *
              * * *  
                *
               *
              * *
            * * * *
              * *
               *      
                 
            */

            int largura = Integer.parseInt(args[1]);

            //part de cima
            for (int i = 0; i < largura-1; i++) {
                
                
                //loop dos espaços em branco
                //ele printa espaços em brancona linha da largura, sem precisar
                for (int j = 1; j < largura - i -1 ; j++){
                    System.out.print("  ");
                }
                //loop dos asteriscos
                //Ele faz uma linha a mais
                for (int j = 0; j < (2*i-1); j++) {
                    System.out.print("* ");
                }
                //pula a linha
                System.out.println(" ");

            }

            //I+1
            // PARTE DE BAIXO
            
                
            
                
            }
        

    }

    private static void ImprimirEspacos(int linhas, int estrelas){





    }
}

