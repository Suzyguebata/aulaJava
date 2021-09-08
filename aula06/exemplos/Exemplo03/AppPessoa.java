package exemplos.Exemplo03;

public class AppPessoa {

    public static void main(String[] args) {
        // cria um novo objeto Pessoa
        Pessoa p = new Pessoa("Rcardo", 23);
        Pessoa p2 = new Pessoa("Suzana", 35);

        //p.nome = "Ricardo";
        //p.idade = 23;
        p.apresentar();

        // CTRL + ; coloca ou tira comentário linha
        //p2.nome = "Suzana";
        //p2.idade = 35;
        p2.apresentar();
    }
}
   
