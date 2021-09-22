
using System;

namespace listaExercicios
{
    class Exercicio03
    {
        public static void executar()
        {
            Console.WriteLine("Digite a altura ");
            int.TryParse(Console.ReadLine(), out int alturaretangulo);

            Console.WriteLine("Digite a base");
            int.TryParse(Console.ReadLine(), out int baseRetangulo);

            int retangulo = baseRetangulo * alturaretangulo;

            Console.WriteLine("Valor do retangulo é {0}", retangulo);
        }
    }
}