package listaexercicios01;

import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
calcular e imprimir o total a receber no final do mês */

public class ex010 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = input.nextLine();
        System.out.print("Digite o salário fixo: ");
        float salario = input.nextFloat();
        System.out.print("Digite o valor total de vendas do mês: ");
        float vendas = input.nextFloat();

        // salario + (vendas + comissao 15%)
        float total = (float) (salario + (vendas * 1.15));

        System.out.format("Vendedor: %s - total a receber: R$%.2f", nomeVendedor, total);

        input.close();
    }
}
