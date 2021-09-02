package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int cont = 100;

        while (cont <= 200){ // while sgignifica enquanto = enquanto for verdadeiro continua
            System.out.print(cont + " ");// println o ln = new line ou nova linha
            cont ++; // sem colocar o con++; ele vira um laço infinito, nunca para o loop somente após dar CTRL + C
        }
    }
}
