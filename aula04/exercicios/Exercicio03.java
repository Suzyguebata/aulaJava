package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        // * SOLUÇÃO * 1 /
        cont = 1;
        while(cont <= numero){
            if (cont <= numero /2) {
                System.out.print(cont + ", ");
            }else {
                System.out.print(cont);
            }
            cont*= 2;// cont = cont * 2;
        }

        System.out.println();

         // * SOLUÇÃO * 2 / refaturação
         cont = 1;
         while(cont <= numero){
            System.out.print(cont);
             if (cont <= numero /2) {
                 System.out.print(", ");
             }
             cont*= 2;// cont = cont * 2;
         }
        entrada.close();
    }
}
