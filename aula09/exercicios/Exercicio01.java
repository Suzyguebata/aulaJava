package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/* Escreva um programa que procura por um nome digitado pelo 
usuário dentro da Arraylist de nomes

*/


public class Exercicio01 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       ArrayList<String> listaDeNomes = new ArrayList<>();
       String nomeProcurado;

       listaDeNomes.add("Pipoca");
       listaDeNomes.add("Chiquita");
       listaDeNomes.add("Bethoven");
       listaDeNomes.add("Barth");
       listaDeNomes.add("Tiko");
       listaDeNomes.add("Teka");

       System.out.println("Digite o nome:");
       nomeProcurado = teclado.nextLine();
        
       boolean naoAchou = true;
       for (String nome : listaDeNomes){
           if (nome.equalsIgnoreCase(nomeProcurado)) {
               System.out.println("Encontrado " + nome);
               naoAchou = false;
               break;
           }
       }
       if (naoAchou) {
           System.out.println("Não encontrado.");
       }
       teclado.close();
    }
}
