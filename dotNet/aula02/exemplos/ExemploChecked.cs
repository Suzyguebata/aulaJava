using System;

namespace Aula02
{
    class ExemploChecked
    {
        public static void executar()
        {
            try
            {
                //Defino minha variável com o máximo valor de um inteiro
                int exemploInteiro = int.MaxValue;
                Console.WriteLine(exemploInteiro);
                //Somo +1 a minha variável.

                //Checked - Forçar o programa a validar essa operação aritmetica
                //Operacoes que ele valida são as seguintes:
                // ++, --, +, -, /, *

                checked { exemploInteiro = exemploInteiro + 1; }
                Console.WriteLine(exemploInteiro);
            }catch(OverflowException ex)
            {
                Console.WriteLine(ex);
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}