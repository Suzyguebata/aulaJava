package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double salarioMinimo, valorQuilowatt, valorDevido , valorDesconto;
        int qtdeKW;

        System.out.println("Digite o salário minimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite valor consumido residencial ");
        qtdeKW = entrada.nextInt();
        
        valorQuilowatt = salarioMinimo / 500;
        valorDevido = valorQuilowatt * qtdeKW;
        valorDesconto = valorDevido * 0.85;

        System.out.println("Valor de cada quilowatt é de R$ " + valorQuilowatt );
        System.out.println("Valor devido é de R$ " + valorDevido);
        System.out.println("Valor com desconto é R$ " + valorDesconto);

        entrada.close();
    }
}
