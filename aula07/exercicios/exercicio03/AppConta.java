package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double valor;
        ContaCorrente cc = null; // null = nulo = sem referencia a um objeto (aponta para NADA)
        ContaEspecial ce = null;
        ContaPoupanca cp = null; 
        
        do{
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Depósito");
            System.out.println("5-Saque");
            System.out.println("6-Consultar saldo");
            System.out.println("7-Sair");
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Criando uma nova conta corrente");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Criando uma nova conta especial");
                    break;
                case 3:
                    System.out.println("Criando uma nova conta poupança");
                    break;
                case 4:
                    System.out.println("Qual o valor do depósito?");
                    valor = teclado.nextInt();
                    cc.depositar(valor);
                    break;
                case 5:
                    System.out.println("Qual o valor do saque?");
                    valor = teclado.nextDouble();
                    cc.sacar(valor);
                    break;
                case 6:
                    System.out.println(cc);
                    break;
                case 7:
                    break;
                    
                default: // se não for nem um das opçoes
                    System.out.println("Opção invalida");
            }

        }while (opcao != 7);

        teclado.close();
    }       
}
