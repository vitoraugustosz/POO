package ads.poo;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa(String email, String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("nome=").append(nome).append('\n');
        sb.append(", cpf='").append(cpf).append('\n');
        sb.append(", email='").append(email).append('\n');
        return sb.toString();
    }
}


