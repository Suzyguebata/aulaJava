package exercicios;

import java.util.Scanner;

public class Exercici02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        media = nota1 *0.4 + nota2 * 0.6;

        if(media>= 6){
            System.out.println("Aprovado com média " + media);
        }else{
            System.out.println("Reprovado com média " + media);
        }

        entrada.close();
    }
}
