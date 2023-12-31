package listaexercicios02;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        double soma = 1;

        for(int i=1; i<num; i++) {
            double numerador = 2 * i;
            double denominador = numerador + 1;

            soma += numerador / denominador;
        }
        System.out.printf("Resultado da soma: %.2f", soma);
    }
}
