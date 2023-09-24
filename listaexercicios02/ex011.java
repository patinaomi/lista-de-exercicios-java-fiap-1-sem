package listaexercicios02;

import java.util.Scanner;

/* Faça um programa que calcule e imprima o resultado da soma abaixo
(lembre-se de que tanto as divisões quanto o
resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
 */
public class ex011 {
    public static void main(String[] args) {
        float total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int cont = 1;

        for(int i=1; i <= num+2; i+=2) {
            float var1 = (float) 1 /i;
            float var2 = (float) 1 /(i+1);
            float result = var1 - var2 ;

            System.out.printf("Loop %d: + %f - %f = %f\n",cont, var1, var2, result);

            total += result;
            cont++;
        }
        System.out.println("Total da soma: " + total);
    }

}
