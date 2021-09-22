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
                Console.WriteLine(" ** 5 - Exercicio 05");
                Console.WriteLine(" ** 6 - Exercicio 06");
                Console.WriteLine(" ** 7 - Exercicio 07");
                Console.WriteLine(" ** 8 - Exercicio 08");
                Console.WriteLine(" ** 9 - Exercicio 09");
                Console.WriteLine(" ** 10 - Exercicio 10");
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
                    case 5:
                        Exercicio05.executar();
                        break;
                    case 6:
                        Exercicio06.executar();
                        break;
                    case 7:
                        Exercicio07.executar();
                        break;
                    case 8:
                        Exercicio08.executar();
                        break;
                    case 9:
                        Exercicio09.executar();
                        break;
                    case 10:
                        Exercicio10.executar();
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
