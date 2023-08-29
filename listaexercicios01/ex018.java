package listaexercicios01;

import java.util.Scanner;

/*Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos
seguintes casos, sempre escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
● se A2 = B2 + C2
, apresente a mensagem: TRIÂNGULO RETÂNGULO
● se A2 > B2 + C2
, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
● se A2 < B2 + C2
, apresente a mensagem: TRIÂNGULO ACUTÂNGULO
● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES */

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        float a = input.nextFloat();
        System.out.print("Digite o valor de B: ");
        float b = input.nextFloat();
        System.out.print("Digite o valor de C: ");
        float c = input.nextFloat();

        float x;

        //ordene-os em ordem decrescente
        if(a<b) {
            x = a;
            a = b;
            b = x;
        }

        if(a<c) {
            x = a;
            a = c;
            b = x;
        }

        if(b<c) {
            x = b;
            b = c;
            c = x;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        input.close();
    }
}
