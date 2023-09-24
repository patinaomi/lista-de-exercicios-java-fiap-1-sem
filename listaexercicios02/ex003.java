package listaexercicios02;
/* Escreva um programa que leia um conjunto de 10 números inteiros positivos.
 Seu programa deve determinar e imprimir o maior deles. Use o laço FOR.
 */

import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNum = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (i == 1) {
                maiorNum = num;
            } else {
                if (num > maiorNum) {
                    maiorNum = num;
                }
            }
        }

        System.out.println("Maior número: " + maiorNum);
    }
}
