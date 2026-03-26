package org.example;

public class Retangulo {
    private String codificacao;
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura, String codificacao) {


        this.largura = (largura>0) ? largura : 4; // validar se é menor ou igual a zero, valor fixo
        this.altura = (altura>0) ? altura : 3;
        this.codificacao = codificacao;
    }



}
