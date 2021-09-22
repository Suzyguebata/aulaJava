
using System;

namespace listaExercicios
{
    class Exercicio03
    {
        public static void executar()
        {
            Console.WriteLine("Digite a altura ");
            int.TryParse(Console.ReadLine(), out int altura);

            Console.WriteLine("Digite a base");
            int.TryParse(Console.ReadLine(), out int baseBase);

            int retangulo = baseBase * altura;

            Console.WriteLine("Valor do retangulo é {0}", retangulo);
        }
    }
}