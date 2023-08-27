package listaexercicios01;

//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.

import java.util.Scanner;

public class ex008 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero1 = input.nextFloat();
        System.out.print("Digite um número: ");
        float numero2 = input.nextFloat();
        System.out.print("Digite um número: ");
        float numero3 = input.nextFloat();
        System.out.print("Digite um número: ");
        float numero4 = input.nextFloat();

        float media = (numero1 + numero2 + numero3 + numero4) / 4;

        System.out.printf("Média: %.2f", media);


    }
    
}
