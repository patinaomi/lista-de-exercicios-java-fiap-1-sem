package listaexercicios01;

// Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.

import java.util.Scanner;

public class ex001 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        int multiplicar = numero1 * numero2;

        System.out.printf("\n%d X %d = %d", numero1, numero2, multiplicar);

        input.close();
    }
}
