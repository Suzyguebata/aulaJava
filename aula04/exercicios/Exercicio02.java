package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, tabuada, resultado;

        System.out.println("Informe qual tabuada quer o resultado:");
        tabuada = entrada.nextInt();

        cont = 0;
        while(cont <=10){
            resultado = tabuada * cont;
            //System.out.println(tabuada + " x " + cont + " = " + (cont * tabuada));
            System.out.printf("%d x %2d = %02d\n", tabuada, cont, resultado );
            cont++;
        }
        entrada.close();
    }
}
