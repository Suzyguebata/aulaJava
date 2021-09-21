using System;

namespace Aula02
{
    class ExemploSwitch
    {
        public static void executar()
        {
            //Exemplo Switch...Case
            
            Console.WriteLine("*** INICIO PROGRAMA ***");
            int diaSemana = 0;

            do
            {
                Console.Write("Digite o dia da semana: (99 para sair)");
                //Exemplo utilizando TryParse
                if(int.TryParse(Console.ReadLine(), out diaSemana))
                {
                    //Usando Switch
                    switch(diaSemana)
                    {
                        case 1:
                            Console.WriteLine("Domingo");
                            break;
                        case 2:
                            Console.WriteLine("Segunda");
                            break;
                        case 3:
                            Console.WriteLine("Terça");
                            break;
                        case 4:
                            Console.WriteLine("Quarta");
                            break;
                        case 5:
                            Console.WriteLine("Quinta");
                            break;
                        case 6:
                            Console.WriteLine("Sexta");
                            break;
                        case 7:
                            Console.WriteLine("Sábado");
                            break;
                        default:
                            Console.WriteLine("Dia Inválido");
                            break;
                    }
                }else
                {
                    Console.WriteLine("Formato Inválido");
                }
            }while(diaSemana != 99);
            Console.WriteLine("*** FIM PROGRAMA ***");
        } 
    }
}