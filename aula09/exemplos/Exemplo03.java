package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap <Integer, Pessoa> mapa1 =new HashMap<>();

        mapa1.put(047, new Pessoa(047, "Suzana Alves", "suzana.alves@itau-unibanco.com.br"));
        mapa1.put(331, new Pessoa(331, "Flávia Campos", "flavia.campos@bb.com.br"));

        System.out.println(mapa1.get(331));
    }
}
