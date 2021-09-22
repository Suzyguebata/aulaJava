using System;

namespace listaExercicios
{
    class Exercicio08
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
            double salariioFixo, comissaoFixaCarro,comissaoVendedorFixaCarro, comissaoValorVendas, valorTotalVendas, salarioFinal;
            int totalCarrosVendidos;

            Console.Write(" - total de carros vendidos: ");
            int.TryParse(Console.ReadLine(), out totalCarrosVendidos);

            Console.WriteLine(" - valor total de vendas: R$ ");
            double.TryParse(Console.ReadLine(), out valorTotalVendas);

            Console.WriteLine(" - Digite o salário fixa: R$ ");
            double.TryParse(Console.ReadLine(), out salariioFixo);

            Console.WriteLine(" - Digite a comissão fixa por carro: R$ ");
            double.TryParse(Console.ReadLine(), out comissaoFixaCarro);

            comissaoValorVendas = valorTotalVendas * ((double)5/100);
            comissaoVendedorFixaCarro = totalCarrosVendidos *comissaoFixaCarro;
            salarioFinal = salariioFixo + comissaoValorVendas + comissaoVendedorFixaCarro;

            Console.WriteLine("-----------------------------------");
            Console.WriteLine("- Salário Fixo: " + salariioFixo);
            Console.WriteLine("- Total comissão carros vendidos: R$ " + comissaoValorVendas);
            Console.WriteLine("- Total comissão fixa por carro vendido: R$ " + comissaoVendedorFixaCarro);
            Console.WriteLine("- Salário Final: R$ " + salarioFinal);
            Console.WriteLine("-----------------------------------");
        }
    }
}