using System;

namespace Aula02
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcao = 0;
            do
            {
                Console.WriteLine(" Digite o número do exemplo: ");
                Console.WriteLine(" ** 1 - Operador Ternario");
                Console.WriteLine(" ** 2 - Switch Case");
                Console.WriteLine(" ** 3 - Exceções");
                Console.WriteLine(" ** 4 - Checked");
                Console.WriteLine(" -- 99 para sair");
                

                int.TryParse(Console.ReadLine(), out opcao);

                switch (opcao)
                {
                    case 1:
                        ExemploTernario.executar();
                        break;
                    case 2:
                        ExemploSwitch.executar();
                        break;
                    case 3:
                        ExemploExcecoes.executar();
                        break;
                    case 4:
                        ExemploChecked.executar();
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