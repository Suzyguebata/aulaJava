package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digte seu número :");
        numero = entrada.nextInt();

        if(numero >= 20){
            System.out.println(numero / 2);
        }

        entrada.close();
    }
}
