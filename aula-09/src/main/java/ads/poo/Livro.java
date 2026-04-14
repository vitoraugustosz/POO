package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(Pessoa a, String t) {
        this.autor = a;
        this.titulo = t;
    }

    public void adicionaCapitulo(String t) {
        Capitulo novoCapitulo = new Capitulo(t);
        capitulos.add(novoCapitulo);
    }

    @Override
    public String toString() {
        return """
                Livro{
                    titulo='$titulo',
                    autor=$autor,
                    capitulos=$capitulos
                }""";
    }
}
