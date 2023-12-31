package listaexercicios02;
/* Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os seguintes
divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente. */

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.printf("Divisores de %d: ", num);
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
