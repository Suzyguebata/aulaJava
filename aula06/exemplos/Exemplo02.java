package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int resultado;

        resultado = soma(10, 5); // recebe o valor calculado pelo método soma

        System.out.println("A soma é " + resultado);
    }

    static int soma(int a, int b){
        int resposta;
        resposta = a+ b;

        return resposta; // devolve o valor calculado
    }
}
