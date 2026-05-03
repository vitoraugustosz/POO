package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private LocalDate dataNasc;
    private ArrayList<Filme> filmes;

    public Ator(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.filmes = new ArrayList<>();
    }

    public void addFilme (Filme filme){
        filmes.add(filme);
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String getNome() {
        return nome;
    }
}
