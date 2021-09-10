package exemplos.exemplo01;

//extends => Gerente é um funcionário - Herança
public class Gerente extends Funcionario {
         public Gerente(String nome, double salario){
             super(nome, salario); // chama o construtor de superclass: Funcionario
         }
    
    }
