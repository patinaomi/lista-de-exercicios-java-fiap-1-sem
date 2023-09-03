/*Escreva um programa em Java para calcular o pagamento de comissão para vendedores de peças automotivas. Considerando que para cada peça vendida, o vendedor terá 5% de comissão. O programa deve ter os seguintes dados:

1)Identificação do vendedor
2)Código da peça
3)Preço unitário da peça
4)Quantidade vendida
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatador);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do vendedor: ");
        byte codigoVendedor = input.nextByte();
        System.out.print("Digite o código da peça: ");
        byte codigoPeca = input.nextByte();
        System.out.print("Digite o preço da peça: ");
        float preco = input.nextFloat();
        System.out.print("Digite a quantidade vendida: ");
        int quantidade = input.nextInt();

        float valorTotal = preco * quantidade;

        float comissao =  (float) (valorTotal * 0.05);

        System.out.println("========= VENDA =========");
        System.out.println("Data da venda: " + dataHoraFormatada);
        System.out.println("Código do vendedor: " + codigoVendedor);
        System.out.println("Cód. Produto [" + codigoPeca + "] - R$" + preco + "un.");
        System.out.println("Qtd. Vendida - " + quantidade + " pçs.");
        System.out.println("Valor total da venda: " + valorTotal);
        System.out.println("Comissão vendedor: " + comissao);
        System.out.println("========================");
        
    }
}
