using System;

namespace listaExercicios
{
    class Exercicio07
    {   /* 
            Uma revendedora de carros usados paga a seus funcionários vendedores 
            um salário fixo por mês, mais uma comissão também fixa para cada carro 
            vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um 
            algoritmo que leia o número de carros por ele vendidos, o valor total de 
            suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
            Calcule e escreva o salário final do vendedor
        */
        public static void executar()
        {
                double custoFabrica, prctDistr, imposto, custoConsum;

            Console.WriteLine("Digite o custo de fábrica : ");
            double.TryParse(Console.ReadLine(), out custoFabrica);

            prctDistr = custoFabrica + (custoFabrica * (0.28));
            imposto = custoFabrica + (custoFabrica * (0.45));
            custoConsum = custoFabrica + imposto + prctDistr;

            Console.WriteLine("O custo de fabrica é: "  + custoFabrica );
            Console.WriteLine("O custo do fina ao consumidor é: "  + custoConsum );
        }
    }
}