package listaexercicios01;

import java.util.Scanner;

/*Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos
seguintes casos, sempre escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
● se A² = B² + C²
, apresente a mensagem: TRIÂNGULO RETÂNGULO
● se A² > B² + C²
, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
● se A² < B² + C²
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
            x = c;
            c = a;
            a = x;
        }

        if(b<c) {
            x = b;
            b = c;
            c = x;
        }

        System.out.format("Valor de A: %.2f B: %.2f C: %.2f\n", a, b, c);
        
        input.close();

        if(a >= (b+c)) {
            System.out.println("Não forma triângulo.");
        } if ((float)Math.pow(a, 2) == (Math.pow(b,2) + Math.pow(c, 2))) {
            System.out.println("Triângulo retângulo.");
        } if ((float)Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("Triângulo obtusângulo.");
        } if ((float)Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("Triângulo acutângulo.");
        } if (a == b && b == c && a ==c) {
            System.out.println("Triângulo equilátero.");

        } if ((a == b && b != c) || (a == c  && b != c) || (b == c && a != b)) {
            System.out.println("Triângulo isósceles.");
        }
    }
}
