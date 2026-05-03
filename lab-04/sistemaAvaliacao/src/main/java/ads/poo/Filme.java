package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String genero;
    private LocalDate lancamento;
    private ArrayList<Ator> elenco;
    private ArrayList<Diretor> direcao;
    private ArrayList<Avaliacao> avaliacoes;

    public Filme(String titulo, String genero, LocalDate lancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
    }

    public void addAvaliacao (Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }

    public double mediaNota(){
        double[] media = {0};
        avaliacoes.forEach(e -> {
            media[0] += e.getNota();
        });
        return media[0]/avaliacoes.size();
    }

    public void addAtor (Ator ator){
        elenco.add(ator);
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public void setElenco(ArrayList<Ator> elenco) {
        this.elenco = elenco;
    }

    public void setDirecao(ArrayList<Diretor> direcao) {
        this.direcao = direcao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public ArrayList<Ator> getElenco() {
        return elenco;
    }

    public ArrayList<Diretor> getDirecao() {
        return direcao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Filme{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", lancamento=").append(lancamento);
        sb.append(", elenco=").append(elenco);
        sb.append(", direcao=").append(direcao);

        sb.append(", avaliacao do público").append(mediaNota());
        sb.append('}');
        return sb.toString();
    }
}
