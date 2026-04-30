# Diagrama UML de modelagem de classes

# Sistema de avaliações de filmes (letterboxd)

```mermaid

classDiagram
    
    class Filme {
        - titulo
        - lancamento
        - genero
        - diretores: ArrayList~Pessoa~
        - elenco - ArrayList~Pessoa~
        - avaliacoes: ArrayList~Avaliacao~
    }

    class Ator {
        - nome: String
        - dataNasc: LocalDate
        - filmes: ArrayList~Filme~
    }
    
    
    
    class Usuario {
        - nome
        - email
        - senha
        - avaliacoes: ArrayList~Avaliacao~
    }
    
    class Avaliacao {
        - filme: Filme
        - nota: int
        - comentario: String
    }



```