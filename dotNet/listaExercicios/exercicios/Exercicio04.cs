using System;

namespace listaExercicios
{
    class Exercicio04
    {
        int dias, meses, anos;
        
        public static void executar()
        {
            Console.WriteLine("informe sua idade");
            int.TryParse(Console.ReadLine(), out int anos);
            
            Console.WriteLine("meses");
            int.TryParse(Console.ReadLine(), out int meses);

            Console.WriteLine("dias");
            int.TryParse(Console.ReadLine(), out int dias);

            dias = (dias+(anos*365)+(meses*30));

            Console.WriteLine("sua idade em dias é: " + dias);
        }
    }
}