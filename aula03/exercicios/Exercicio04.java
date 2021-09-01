package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao;

        System.out.println("Digite 2 números: ");
        salarioBruto = entrada.nextDouble();
        prestacao = entrada.nextDouble();

        if(salarioBruto > prestacao){
            System.out.println(salarioBruto + ", " + prestacao);
        }else{
            System.out.println(prestacao +", " + salarioBruto);
        }
        entrada.close();
    }
}
