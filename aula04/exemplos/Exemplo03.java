package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // printf( FORMATAÇÃO, DADOS) == print formatado
        // formatação == como exibir
        // dados = o QUE exibir

        // caracter de controle: 
        // %d = int
        // %s = String
        // %f = numeros com decimal ( double ou float)
        // %.2f = números com decimal .2 = 2 casas decimais
        // %2f = número de digitos na parte inteira
        // \n = pula linha

        System.out.printf("Sua idade é %d\n" , 35);
        System.out.printf("Sua idade é %d e seu telefone é %s\n" , 35, "41 - 997117706");
        System.out.printf("idade: %d altura: %f peso: %f\n", 35, 1.53, 58.12345);
        System.out.printf("idade: %d altura: %.2f peso: %.2f\n", 35, 1.53, 58.12345);
    }
}
