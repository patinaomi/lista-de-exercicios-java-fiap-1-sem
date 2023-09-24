/* Implemente um programa que recebe a quantidade de laranjas que o cliente deseja comprar e se o pagamento será por pix ou não (boolean). Caso a quantidade seja menor do que 10, o valor de cada laranja será R$2,50. Caso seja maior ou igual a 10, o valor será R$2,00. Se o pagamento for por pix, será adicionado um desconto de 10%.
 * 
 */

import java.util.Scanner;

public class ComprasLaranjas {
    public static void main(String[] args) {
        float valorTotal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de laranjas: ");
        int qtdLaranjas = sc.nextInt();
        System.out.println("Pagamento por pix? (true/false) ");
        boolean pix = sc.nextBoolean();

        if(qtdLaranjas < 10) {
            valorTotal = (float) (qtdLaranjas * 2.50);
        } else {
            valorTotal = qtdLaranjas * 2;
        }
        if(pix == true) {
            valorTotal = (float) (valorTotal - (valorTotal * 0.10));
            //ou valorTotal *= 0.9;
        }

        System.out.println("Valor da compra: R$" + valorTotal);

        
    }
}
