package listaexercicios02;

import java.util.Scanner;

/* Faça um programa que leia um número natural N e calcule a
 soma abaixo (lembre-se de que tanto as divisões quanto o
 resultado devem ser decimais). Utilize o laço que lhe
 for mais conveniente. */
public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float soma = 0;

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        for(int i=0; i<=n; i++) {
            soma += (float) i / (n - i + 1);
        }

        System.out.printf("Resultado: %.2f", soma);
    }
}
