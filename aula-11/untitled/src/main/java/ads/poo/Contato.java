package ads.poo;

import java.time.LocalDate;

public class Contato {


    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones = new ColecaoTelefone();
    private ColecaoEmail emails = new ColecaoEmail();

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    
}
