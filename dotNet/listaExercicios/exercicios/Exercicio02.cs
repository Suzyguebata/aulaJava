using System;

namespace listaExercicios 
{
    class Exercicio02
    {
        public static void executar()
        {
            
            Console.Write("Digite um valor: ");
            if (int.TryParse(Console.ReadLine(),out int valor))
            {
                --valor;
                Console.WriteLine("valor diminuido é {0}", valor );

            }else
            {
                Console.WriteLine("**valor inválido.");
            }
            
        }
    }
}