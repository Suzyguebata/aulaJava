package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String exibirDados(){
        return nome + " : " + salario;
    }
    public double getSalario(){
        return salario;
    }
}