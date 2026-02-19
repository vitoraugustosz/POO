public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá Mundo");
        

        int i = 2;
        String valor;

        switch(i){
            case 1:
                valor = "Sou uma String hehe";
                break;
            case 2:
                valor = "Santos futebol clube";
                break;
            default:
                valor = "Não sou nada";
        }
        System.out.println(valor);
    }
}