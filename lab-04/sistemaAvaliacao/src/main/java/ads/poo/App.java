package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    private HashMap<String, Usuario> contas;
    private HashMap<String, Filme> filmes;

    public App(){
        this.contas = new HashMap<>();
        this.filmes = new HashMap<>();
    }

    public void menu(int e){
        switch (e){
            case 1 -> {
                this.cadastrar();
            }
            case 2 -> {
                this.entrar();
            }

            case 3 -> {
                this.avaliar();
            }

            case 4-> {
                System.out.println(this.printFilme(
                        IO.readln("Qual o nome do filme?"))
                );
            }
        }

    }

    public



    static void main() {

        App app = new App();
        int entrada = Integer.valueOf(IO.readln("""
                ..:: Escolha uma opcao::..
                
                3- Avaliar um filme
                4- Ver sobre um filme
                """));
        app.menu(entrada);

    }

    public Usuario cadastrar(){
        System.out.println("Cadastro de novo usuário");
        String e = IO.readln("Já possui uma conta? 1- Sim, 2- Não");
        if (Integer.valueOf(e) == 1) {
            Usuario user = entrar();
            return user;
        }
        String email = IO.readln("Qual seu email");
        String senha = IO.readln("Digite uma senha");
        String nome = IO.readln("Qual seu nome de usuário?");
        Usuario novoUsuario = new Usuario(nome, email, senha);
        this.contas.put(nome, novoUsuario);
        return novoUsuario;

    }

    public Usuario entrar(){
        Usuario[] usuarios = {null};
        String nome = IO.readln("Qual o nome de usuário?");
        if (contas.containsKey(nome)){
            String senha = IO.readln("Qual a senha?");
            contas.forEach((n, u) -> {
                do {
                    if (u.getSenha().equals(senha)) {
                        System.out.println("Acesso autorizado");
                        usuarios[0] = u;
                    } else {
                        System.out.println("Senha incorreta, tente novamente");
                    }
                } while (!u.getSenha().equals(senha));
            });
        }
        return usuarios[0];
    }

    public void avaliar(){
        System.out.println("Sem conta. Favor cadastrar sua conta");
        Usuario user = cadastrar();
        Filme[] filme = {null};
        String nomeFilme = IO.readln("Que filme gostaria de avaliar?");
        if (filmes.containsKey(nomeFilme)){
            int nota = Integer.valueOf(IO.readln("Qual a nota do filme, de 1 a 5?"));
            String comentario = IO.readln("Escreva seu comentário (se não quiser um comentário, apenas tecle enter");

            filmes.forEach((n, f) -> {
                if (n.equalsIgnoreCase(nomeFilme)){
                    filme[0] = f;
                }
            });
            Avaliacao novaAvaliacao = new Avaliacao(filme[0], nota, user);
        } else {
            System.out.println("Não temos esse filme cadastrado no nosso banco de dados. Favor, cadastre-o");
            String data = IO.readln("Qual a data de lançamento do filme? (digite no padrão AAAA/MM/DD");
            String genero = IO.readln("Qual o genero do filme?");
            filme[0] = cadastrarFilme(nomeFilme, data, genero);
        }

    }

    public Filme cadastrarFilme(String nome, String dataString, String genero) {
         LocalDate data = LocalDate.parse(dataString);
        Filme novoFilme = new Filme(nome, genero, data);
        filmes.put(nome, novoFilme);
        return novoFilme;
    }

    public String printFilme(String nome){
        String filmeString = filmes.get(nome).toString();
        return (filmes != null) ? filmeString : "Filme não encontrado";
    }

}
