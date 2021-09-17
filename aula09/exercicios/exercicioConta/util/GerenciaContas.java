package exercicios.exercicioConta.util;

import java.util.HashMap;

import exercicios.exercicioConta.entidades.Conta;
import exercicios.exercicioConta.entidades.ContaCorrente;
import exercicios.exercicioConta.entidades.ContaEspecial;
import exercicios.exercicioConta.entidades.ContaPoupanca;

//ALT +SHIFT + O = arruma import's

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta){
        ContaCorrente cc = new ContaCorrente(numeroConta);
        contas.put(numeroConta, cc);
        //conats.add(new ContaCorente(numeroConta))
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta,new ContaPoupanca(numeroConta));
    }

    public String exibirSaldo(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta != null) {
            return "conta: " + conta;
        }
        /* for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) {
                return "conta: " + conta;
            }
        } */

        return "Conta não existe.";
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if (conta != null) {
            return conta.depositar(valor);
        }
        return false; 
    }
    public boolean sacar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if (conta != null) {
            return conta.sacar(valor);
        } 
        return false; 
    }
}
