package exercicios;

import java.util.Scanner;

public class Exercicio01 {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, maior;

    System.out.println("Digite o primeiro número: ");
    maior = entrada.nextInt();

    for (int i =0; i < 10; i++) {
        System.out.println("Digite o próximo número: ");
        numero = entrada.nextInt();
        if(numero > maior){

        }
    }

    entrada.close();}

    
}

