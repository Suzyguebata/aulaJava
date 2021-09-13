package exercicios.exercicioConta.entidades;

public class ContaCorrente extends Conta {
    // final = constante, não pode mudar o valor
    final static double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            return super.sacar(valor);
        }
        return false; // não tem saldo
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

}
