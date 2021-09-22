using System;

namespace listaExercicios
{
    class Program
    {
        static void Main(string[] args)
        {
           int opcao = 0;
            do
            {
                Console.WriteLine(" Digite o número do exercicio: ");
                Console.WriteLine(" ** 1 - Exercicio 01");
                Console.WriteLine(" ** 2 - Exercicio 02");
                Console.WriteLine(" ** 3 - Exercicio 03");
                Console.WriteLine(" ** 4 - Exercicio 04");
                Console.WriteLine(" -- 99 para sair");
                

                int.TryParse(Console.ReadLine(), out opcao);

                switch (opcao)
                {
                    case 1:
                        Exercicio01.executar();
                        break;
                    case 2:
                        Exercicio02.executar();
                        break;
                    case 3:
                        Exercicio03.executar();
                        break;
                    case 4:
                        Exercicio04.executar();
                        break;
                    case 99:
                        Console.WriteLine("Finalizando programa.");
                        break;
                    default:
                        Console.WriteLine("Opção inválida.");
                        break;
                }
            }while(opcao != 99);
        }
    }
}