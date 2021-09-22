using System;

namespace listaExercicios
{
    class Exercicio04
    {
        int diasAno = 365;
        int diasMes = 30;
        int dias, meses, anos;

        DateTime anoNascimento;
        
        public static void executar()
        {
            Console.WriteLine("informe sua idade");
            int.TryParse(Console.ReadLine(), out int anos);
            
            Console.WriteLine("meses");
            int.TryParse(Console.ReadLine(), out int meses);

            Console.WriteLine("dias");
            int.TryParse(Console.ReadLine(), out int dias);

            


        }
    }
}