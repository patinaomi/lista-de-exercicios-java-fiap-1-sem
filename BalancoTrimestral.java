public class BalancoTrimestral {

    /* Ex 002 - Na empresa onde trabalhamos há uma tabela com o quanto foi gasto em cada mês. Para fechar o balanço do 
    primeiro trimestre, precisamos somar o gasto total, sabendo que em Janeiro, foram gastos R$ 15000, em 
    Fevereiro, R$ 23000 e em Março, R$ 17000. Faça um programa que calcule e imprima o gasto total no trimestre. 
    Siga os passos abaixo:
        1) Crie uma classe chamada BalancoTrimestral com um bloco main (exemplo anterior)
        2) Dentro do main, declare uma variável inteira chamada gastosJaneiro e inicialize-a com R$ 15000
        3) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com R$ 23000 e R$ 
        17000, respectivamente (utilize uma linha para cada declaração)
        4) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis:
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco
        5) Imprima a variável gastosTrimestre
        6) Adicione um código (sem alterar as linhas que já existem) para imprimir a média mensal de gastos, 
        criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com valor 
        utilizando a expressão “Valor da média mensal = “ + media mensal
    */

    public static void main(String[] args) {

        float gastosJaneiro = 15000;
        float gastosFevereiro = 23000;
        float gastosMarco = 17000;

        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        float mediaMensal = gastosTrimestre / 3;

        System.out.printf("Gastos trimestrais: R$%.2f", gastosTrimestre);
        System.out.printf("\nValor da média mensal: R$%.2f",  mediaMensal);
        
    }
}
