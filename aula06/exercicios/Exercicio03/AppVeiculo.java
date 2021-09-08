package exercicios.Exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Ford", "Agile", 10.6);
        v.exibirDados();

        //v.consumo = -10;
        v.setConsumo(-10);

        double consumo = v.getConsumo();
        System.out.println ("Consumo: " + consumo);
    }
}
