package listaexercicios02;
/* Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número. Fatorial de N é
representado por N! e calculado da seguinte maneira: 𝑁! = 𝑁 ∗ (𝑁 − 1) ∗ (𝑁 − 2) ∗. . .∗ 3 ∗ 2 ∗ 1 Utilize o laço que
lhe for mais conveniente. */

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int soma = 1;

        do {
            System.out.print("Digite um número maior que 0: ");
            num = input.nextInt();

            System.out.println("Cálculo do Fatorial de " + num);
            for(int i = 1; i<=num; i++) {
                System.out.printf("*   %d! - ", i);
                soma *= i;
                System.out.println(soma);
            }

        } while(num <= 0);
    }
}
