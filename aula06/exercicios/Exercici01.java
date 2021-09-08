package exercicios;

public class Exercici01 {
    public static void main(String[] args) {
        boolean resultado;

       /*resultado = ehPar(10);
        if(resultado == true){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    */

        resultado = ehPar(11);

        if(resultado){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }

    /* static boolean ehPar(int numero){
        if(numero % 2 == 0) {
            return true;
        }else{
            return false;
        }
    } 
*/
    static boolean ehPar(int numero){
        if(numero % 2 == 0) {
            return true;
        }
        
        return false;
     
    }
}
