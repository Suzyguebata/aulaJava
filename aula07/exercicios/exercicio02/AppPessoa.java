package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa n = new Pessoa("Suzana", "(41) 99711-7706");
        Estudante e = new Estudante("Suzana","(41) 99711-7706", "BigData");
        Professor p = new Professor("Flávia", "(41) 99724-7680", 5000);

        System.out.println(n);
        System.out.println(e);
        System.out.println(p);
    }
}
