   
using System;

namespace Aula02
{
    class ExemploExcecoes
    {
        public static void executar()
        {
            try
            {
                //Código
                Console.Write("Digite a Idade do Aluno: ");
                int idadeAluno = int.Parse(Console.ReadLine());




                
            }catch(Exception ex)
            {
                Console.WriteLine("Idade Inválida" + ex.ToString());
            }finally
            {
                //Sempre vai ser executado, com ou sem erro.
                Console.WriteLine("Fim do exemplo");
            }
        }
    }
}