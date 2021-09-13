package exercicios.exercicioConta.entidades;

// abstract = a classe é um modelo para outras classes
// não posso criar objetos de uma classe abstrata
public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numero + ": " + saldo;
    }
}
