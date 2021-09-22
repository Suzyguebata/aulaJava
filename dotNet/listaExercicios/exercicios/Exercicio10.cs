using System;

namespace listaExercicios
{   /*
        Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, 
        calcular e escrever o valor correspondente em graus Celsius, 
        considerando a fórmula abaixo
        c/5 = (F-32)/9
    */
    class Exercicio10
    {
        public static void executar()
        {
            float celsius, fahrenheit;

            Console.WriteLine("Informe a temperatura em Fahrenheit");
            float.TryParse(Console.ReadLine().Replace(".",","), out fahrenheit);

            celsius = (fahrenheit - 32) * ((float)5/9);

            Console.WriteLine(" *** Temperatura em Celsius: " + Math.Round(celsius,1) + "°");

        }
    }
}