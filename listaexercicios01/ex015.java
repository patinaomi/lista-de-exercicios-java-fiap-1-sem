package listaexercicios01;
/*Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre 
a mensagem correspondente “Impossível calcular”. */

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        float valorA = input.nextFloat();
        System.out.print("Digite o valor de B: ");
        float valorB = input.nextFloat();
        System.out.print("Digite o valor de C: ");
        float valorC = input.nextFloat();

        float delta = (float)Math.pow(valorB,2) - 4 * valorA * valorC;

        //se o delta for negativo, a equação não possui raízes reais
        if(delta < 0) {
            System.out.println("Impossível calcular");
        } else {
        //se delta for positivo, a equação possui duas raízes reais
            float x1 = (float) ((-valorB + Math.sqrt(delta)) / (2 * valorA));
            float x2 = (float) ((-valorB - Math.sqrt(delta)) / (2 * valorA));

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        input.close();
    }
}