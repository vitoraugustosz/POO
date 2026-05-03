package ads.poo;

import java.util.ArrayList;

public class Usuario {

    private String senha;
    private String nome;
    private String email;
    private ArrayList<Avaliacao> avaliacoes;

    public Usuario( String nome, String email, String senha) {
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.avaliacoes = new ArrayList<>();
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}
