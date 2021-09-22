using System;

namespace listaExercicios 
{
    class Exercicio02
    {
        public static void executar()
        {
            Console.WriteLine("Digite um valor");
            int.TryParse(Console.ReadLine(),out int valorDigitado);
            --valorDigitado;
            Console.WriteLine("valor diminuido é{0}", valorDigitado );
        }
    }
}