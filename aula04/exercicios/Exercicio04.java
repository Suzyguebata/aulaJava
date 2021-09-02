package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, cont;

        numero = 1;
        cont = 1;
        soma = 0;
        while (numero != 0) {
            System.out.printf("Digite o %dº número: ", cont++);
            numero = entrada.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma dos valores: " + soma);
        
        entrada.close();
    }
    
}
