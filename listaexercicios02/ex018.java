package listaexercicios02;
/* A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci. Nessa sequência,
cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (onde
N < 46) e mostre os N primeiros números dessa série. Utilize o laço que lhe for mais conveniente. */

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int numPrimeiro = 0;
        int numSegundo = 1;

        while(true) {
            System.out.print("Digite um número até 46: ");
            num = input.nextInt();

            if (num > 0 && num < 46) {
                break;
            } else {
                System.out.println("Número inválido. Por favor, digite um número maior que 0 e até 46.");
            }
        }

        System.out.println("Sequência Fibonacci");
        for(int i=1; i<=num; i++) {
            System.out.print(numPrimeiro + " ");
            int proxNum = numPrimeiro + numSegundo;
            numPrimeiro = numSegundo;
            numSegundo = proxNum;
        }

        input.close();
    }
}
