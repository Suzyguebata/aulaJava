package exercicios.exercicio01;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, int anoNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario();
    }

    public Animal(String nome, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nomeProprietario, telefone);
    }

    public Animal(String nome, String raca, int anoNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return nome + " - " + raca + " - " + anoNascimento + " - " + proprietario.toString();
    }
}
