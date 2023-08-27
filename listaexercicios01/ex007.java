package listaexercicios01;

/* Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo. 
Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴² + 𝐵²
Dica: nesse programa, você deve usar a função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).
*/

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num = (float) Math.sqrt(121);
        System.out.println(num);

        System.out.print("Digite o lado A: ");
        float ladoA = input.nextFloat();
        System.out.print("Digite o lado B: ");
        float ladoB = input.nextFloat();

        float hipotenusa = (float) Math.sqrt((Math.pow(ladoA,2) + Math.pow(ladoB, 2)));

        System.out.printf("Cálculo da hipotenusa do triângulo: %.2f", hipotenusa);

        input.close();
    }
}
