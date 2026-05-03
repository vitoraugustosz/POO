package ads.poo;

public class Avaliacao {
    private Filme filme;
    private int nota;
    private Usuario usuario;
    private String comentario;

    public Avaliacao(Filme filme, int nota, Usuario user){
        this.nota = nota;
        this.filme = filme;
        filme.addAvaliacao(this);
    }

    public void addComentario(String comentario){
        this.comentario = comentario;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Filme getFilme() {
        return filme;
    }

    public int getNota() {
        return nota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Avaliacao{");
        sb.append("filme=").append(filme);
        sb.append(", nota=").append(nota);
        sb.append(", usuario=").append(usuario);
        sb.append(", comentario='").append(comentario).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
