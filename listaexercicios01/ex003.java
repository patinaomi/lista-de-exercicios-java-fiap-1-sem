package listaexercicios01;

/*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos
dois números. O quadrado de um número A é representado por A² = A * A. */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        int somaQuadrados = (numero1 * numero1) + (numero2 * numero2);

        System.out.printf("Resultado: %d² + %d² = %d", numero1, numero2, somaQuadrados);

        input.close();
    }
}
