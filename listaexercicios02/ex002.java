package listaexercicios02;
/* Faça um programa que leia um número N do usuário, some
todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE. */

import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.printf("Números de %d a %d:\n", i, num);
        while(i <= num) {
            System.out.print(i + ", ");
            i++;
        }
    }
}
