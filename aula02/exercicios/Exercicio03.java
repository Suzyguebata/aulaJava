package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salario, novoSalario;

        System.out.println("Digite seu salário atual :");
        salario = entrada.nextDouble();

        novoSalario = (salario * 0.25) + salario;

        System.out.println("Seu novo salário é " + novoSalario);

        entrada.close();
    }
}
