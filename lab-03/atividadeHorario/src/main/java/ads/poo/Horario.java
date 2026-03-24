package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    private int MAXHORA = 23;
    private final int MAXMINESEG = 59;


    /*
    * ==========================
    * CONSTRUTORES
    * ==========================
    * */
    public Horario(int hora, int minuto, int segundo) {
        if (hora > MAXHORA || minuto > MAXMINESEG || segundo > MAXMINESEG) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Horario(int hora, int minuto){
        if (hora > MAXHORA || minuto > MAXMINESEG) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;

    }

    public Horario(int hora){
        if (hora > MAXHORA ) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /*
    * =============================
    * SETTERS
    * */

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /*
    *===============
    *TO STRING
    * */

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    /*Imprimir por extenso
    * */

    private String escreverPorExtenso(int valor){
        return switch (valor){
            case 0 -> "";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezeseis";
            case 17 -> "dezesete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";

        };

    }

    public int cortarValor(int valor){
        if (valor>=20){
            int dezena = valor/10;
            int unidade = valor%10;
            String dezenaTxt = escreverPorExtenso(dezena);
            String unidadeTxt = escreverPorExtenso(unidade);
        }
    }

    public String porExtenso(){
        if (this.hora>=20){
            int dez = this.hora/10;
            String dezS =
        }
    }

    /* Imprimir em segundos
    * */

    public long transformInSeconds(){
        return (this.hora*3600 + this.minuto*60 + this.segundo);
    }

    /*Diferença
    * */

    public long calcDiferenca (Horario horario){
        long horarioUm = this.transformInSeconds();
        long horarioDois = horario.transformInSeconds();
        return Math.abs(horarioUm-horarioDois);
    }

}
