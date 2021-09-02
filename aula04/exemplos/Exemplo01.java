package exemplos;

public class Exemplo01{
    public static void main(String[] args) {
        int cont;
        
        cont = 1;// ponto de inicio

        while (cont <10){
            System.out.println(cont);
            cont ++; // soma 1 na variavel // le-se como cont = cont + 1;
            // para cont = cont + 2 brevia se cont +=2
        }
        System.out.println("final: " + cont);
    }
}