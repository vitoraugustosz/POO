package ads.poo;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    @Override
    public String toString() {
        return """
                Pessoa{
                    nome='$nome', 
                    idade=$idade, 
                    email='$email'
                }""";
    }
}
