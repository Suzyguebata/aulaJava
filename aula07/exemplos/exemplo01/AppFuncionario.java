package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 2000);
        Gerente gerente = new Gerente("Ricardo", 1000);

        System.out.println(funcionario.exibirDados());
        System.out.println(gerente.exibirDados());
    }
}
