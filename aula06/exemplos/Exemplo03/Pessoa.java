package exemplos.Exemplo03;

public class Pessoa {

 // atributos
 String nome;
 int idade;

 // método construtor = inicializar o objeto
 Pessoa(String s, int i){
     nome = s;
     idade = i;
 }

 // métodos
 void apresentar(){
     System.out.println("Olá! Eu sou " + nome);
     System.out.printf("Tenho %d anos.\n", idade);
 }
}
