package listaexercicios02;

/*Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos
próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não. Utilize o laço que lhe for
mais conveniente.*/

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int i = 1;
        int soma = 0;

        while(soma < num) {
            soma += i;
            i++;
        }

        if(soma == num) {
            System.out.printf("O número %d é PERFEITO.", num);
        } else {
            System.out.printf("O número %d NÃO é perfeito.", num);
        }
    }
}
