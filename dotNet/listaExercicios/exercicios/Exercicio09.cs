using System;

namespace listaExercicios
{   /*
        Faça um algoritmo que leia três notas de um aluno, calcule e escreva a 
        média final deste aluno. Considerar que a média é ponderada e que o 
        peso das notas é 2, 3 e 5. O cálculo final da média deve ser realizado de 
        acordo com a fórmula abaixo:
        mediaFinal = ((n1*2)+(n2*3)+(n3*5))/10
    */
    class Exercicio09
    {
        public static void executar()
        {
            float n1, n2, n3, mediaPonderada;

            Console.WriteLine(" - Digite a nota 1: ");
            float.TryParse(Console.ReadLine(), out n1);

            Console.WriteLine(" - Digite a nota 2: ");
            float.TryParse(Console.ReadLine(), out n2);

            Console.WriteLine(" - Digite a nota 3: ");
            float.TryParse(Console.ReadLine(), out n3);

            mediaPonderada = ((n1*2)+(n2*3)+(n3*5))/10;

            Console.WriteLine("A média final é: " + mediaPonderada);
        }
    }
}