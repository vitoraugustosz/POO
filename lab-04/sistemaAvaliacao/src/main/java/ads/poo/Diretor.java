package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diretor {

    private String nome;
    private LocalDate nasc;
    private ArrayList<Filme> filmes;

    public Diretor(String nome, LocalDate nasc) {
        this.nome = nome;
        this.nasc = nasc;
        this.filmes = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }


}
