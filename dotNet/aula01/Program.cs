using System;

namespace aula01
{
    class Program
    {
        static void Main(string[] args)
        {
            int idade = 35;
            string nomeAluno, sobrenomeAluno;
            bool validaridade;
            //int

            //idade = idade +1; //36 int Console.Write

            //idade++; // Nesse caso adicionei +1 a idade depois da leitura

            //++idade; // Nesse caso adicionei +1 a idade antes da leitura

            /* 
                Operadores matemáticos

                + -> Soma
                - -> Subtração
                / -> Divisão
                * -> Multiplicação

                % -> Resto

                && -> AND
                || -> OR
                != -> DIFERENTE
                == -> IGUAL

            /*
                Um bloco de comentário
                Tudo que estiver aqui será ignorado pelo compilador
            */
            
            //exemplo IF
            if (idade%2==0)
            {
                Console.WriteLine("Número par ");
            }
            else
            {
                Console.WriteLine("Número impar ");
            }

            //exemplo FOR
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
            }

            // exemplo WHILE
            int x = 5;
            while (x>0)
            {
                Console.WriteLine("X: " + x--); 
            }

             Console.WriteLine("A minha idade é " + idade);
        }
    }
}
