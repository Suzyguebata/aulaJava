package exemplos;

public class Pessoa {
    private int cpf;
    private String nome, email;

    public Pessoa(int cpf, String nome, String email) {
        this.cpf =cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return cpf + " - " + nome + " - " + email;
    }
}
