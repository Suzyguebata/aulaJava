package exercicios.Exercicio03;

public class Veiculo {
    String modelo, marca;
    private double consumo;

    Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    void exibirDados(){
        System.out.printf("Marca: %s\nModelo: %s\n", marca , modelo);
    }

    double getConsumo(){ // obterConsumo
        return consumo;
    }
    
    void setConsumo(double consumo){ //alterarConsumo
        if(consumo >0){
            this.consumo = consumo;
        }
    }

}
