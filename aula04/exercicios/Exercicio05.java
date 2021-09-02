package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, par, impar;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o %dº número: ", i);
            numero = entrada.nextInt();

            if (numero % 2 == 0) {//verifica se o número é par
                par++;
            }else{
                impar++;
            }
        }

        System.out.println("O total de pares é " + par);
        System.out.println("O total de ímpares é " + impar);

        entrada.close();
    }
}
