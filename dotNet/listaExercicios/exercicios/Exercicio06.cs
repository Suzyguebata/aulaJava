using System;

namespace listaExercicios
{   /* 
        Escreva um algoritmo para ler o salário mensal atual de um funcionário e 
        o percentual de reajuste. Calcular e escrever o valor do novo salário.
    */
    class Exercicio06
    {   
        public static void executar()
        {
            Console.WriteLine("Digite seu salário atual: ");
            double.TryParse(Console.ReadLine(), out double salario);

            Console.WriteLine("Digite o percentual de reajuste: ");
            double.TryParse(Console.ReadLine(), out double pscrReajuste);

            double aumento;
            aumento = (pscrReajuste/100) * salario;
            Console.WriteLine("Seu novo salário é: " + (Math.Round(aumento+salario,2)));
        
        }
    }
}