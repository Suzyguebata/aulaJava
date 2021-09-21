using System;

namespace Aula02
{
    class ExemploTernario
    {
        public static void executar()
        {
            //Exemplo de Operador Ternario 
            
            string saudacao = DateTime.Now.AddHours(-4).Hour > 12 ? "Boa Tarde" : "Bom dia";
            Console.WriteLine(saudacao + " - Hora: " + DateTime.Now.AddHours(-4).Hour);

            saudacao = DateTime.Now.Hour > 12 ? "Boa Tarde" : "Bom dia";
            Console.WriteLine(saudacao + " - Hora: " + DateTime.Now.Hour + ":"+DateTime.Now.Minute);
            Console.WriteLine(saudacao + " - Hora: " + DateTime.Now.ToShortTimeString());
            Console.WriteLine(saudacao + " - Hora: " + DateTime.Now.ToString("HH:mm:ss"));

            int idade = 20;
            Console.WriteLine(idade > 18 ? "Maior de Idade" : "Menor de Idade");
        }
    }
}