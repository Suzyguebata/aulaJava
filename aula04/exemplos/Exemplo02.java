package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont = 1;

        //cont --; subtrai 1 do valor da variável

        // cont ++; pós incremento ; soma depois de ter usado a variável
        // ++cont; pré encremento ; soma antes de usar a variável

        System.out.println(cont++); // mostra valor 2 e depois soma 1, ficando cont = 2
        System.out.println(cont); // mostra o valor atual que será 2

        System.out.println(++cont); // primeiro soma 1 na variável, depois mostra valor 3
        System.out.println(cont); // mostra o valor atual que será 3
    }
}
