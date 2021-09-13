package exercicios.exercicioConta.util;

import java.util.ArrayList;

import exercicios.exercicioConta.entidades.Conta;
import exercicios.exercicioConta.entidades.ContaCorrente;

//ALT +SHIFT + O = arruma import's

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        ContaCorrente cc = new ContaCorrente(numeroConta);
        contas.add(cc);
        //conats.add(new ContaCorente(numeroConta))
    }

    public void exibirContas() {
        System.out.println(contas);
    }
}
