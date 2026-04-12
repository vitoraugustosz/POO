package org.example;

public class Retangulo {
    private String codificacao;
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura, String codificacao) {
        this.largura = (largura>0) ? largura : 4; // validar se é menor ou igual a zero, valor fixo
        this.altura = (altura>0) ? altura : 3;
        this.codificacao = codificacao.equalsIgnoreCase("ASCII") ? "ASCII" : (codificacao.equalsIgnoreCase("UTF8")) ? "UTF8" : "ASCII";
    }

    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        this.codificacao = "ASCII";
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setCodificacao(String codificacao) {
        switch (codificacao.toUpperCase()){
            case "ASCII":
                this.codificacao = codificacao;
                return true;
            case "UTF8":
            case "UTF-8":
            case "UTF 8":
                this.codificacao = "UTF-8";
                return true;
            default:
                return false;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public int calcularArea(){
        return this.largura*this.altura;
    }

    public int calcularPerimetro(){
        return 2*(this.largura+this.altura);
    }

    public String print(){
        String retangulo = "";
        String quina = (this.codificacao.equals("ASCII"))? "+" : "\u250c";
        String bordaLateral = (this.codificacao.equals("ASCII")? "|" : "\u2502");
        String bordaSuperior = (this.codificacao.equals("ASCII")? "-" : "\u2502");
        for (int i = 0; i < this.altura; i++) {
            if (i==0 || i == this.altura-1){
                retangulo = retangulo + quina;
            } else {
                retangulo = retangulo + bordaLateral;
            }

            for (int j = 1; j < this.largura; j++) {
                if (j==this.largura-1){
                    if (i==0 || i == this.altura-1){
                        retangulo = retangulo + quina;
                    } else {
                        retangulo = retangulo + bordaLateral;
                    }
                } else {
                    if (i==0 || i == this.altura-1){
                        retangulo = retangulo + bordaSuperior;
                    } else{
                        retangulo = retangulo + " ";
                    }
                }
            }
            retangulo = retangulo + "\n";

        }
        return String.format(retangulo);

    }

}
