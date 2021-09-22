using System;

namespace listaExercicios
{
    class Exercicio05
    {   
        /* 
            Escreva um algoritmo para ler o número total de eleitores de um 
            município, o número de votos brancos, nulos e válidos. Calcular e 
            escrever o percentual que cada um representa em relação ao total de 
            eleitores.
        */
        
        public static void executar()
        {   
            int votoNulo, votoBranco, votoValido;

            int totalEleitores;

            Console.WriteLine("Digite o numero total de votos nulos: ");
            int.TryParse(Console.ReadLine(), out votoNulo);

            Console.WriteLine("Digite o numero total de votos em branco: ");
            int.TryParse(Console.ReadLine(), out votoBranco);

            Console.WriteLine("Digite o numero total de votos válidos: ");
            int.TryParse(Console.ReadLine(), out votoValido);

            totalEleitores = votoNulo + votoBranco + votoValido;

            if (totalEleitores<=0)
            {
                Console.WriteLine("Total de eleitores inválido");
            }else
            {
                Console.WriteLine("O número total de eleitores foi de: " + totalEleitores);
            }


            if (votoNulo<0)
            {
                Console.WriteLine("valor de voto válido incompativel");
            }else
            {
                Console.WriteLine("Quantidade de votos nulos: " + votoNulo);
                Console.WriteLine("Porcentagem de votos nulos: " + (Math.Round(((double)votoNulo/(double)totalEleitores)*100,2)) + "%");
            }

            
            if (votoBranco<0)
            {
                Console.WriteLine("valor de voto válido incompativel");
            }else
            {
                Console.WriteLine("Quantidade de votos em branco: " + votoBranco);
                Console.WriteLine("Porcentagem de votos em branco: " + (Math.Round(((double)votoBranco/(double)totalEleitores)*100,2))+ "%");
            }

            if (votoValido<0)
            {
                Console.WriteLine("valor de voto válido incompativel");
            }else
            {
                Console.WriteLine("Quantidade de votos válidos: " + votoValido);
                Console.WriteLine("Porcentagem de votos validos: " + (Math.Round(((double)votoValido/(double)totalEleitores)*100,2)) + "%");
            }

        }
    }
}