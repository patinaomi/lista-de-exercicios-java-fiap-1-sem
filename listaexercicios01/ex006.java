package listaexercicios01;

import java.util.Scanner;

/*Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
A = b*h/2

b) a área do círculo de raio C. (π = 3.14159)
A = pi * raio²

c) a área do trapézio que tem A e B por bases e C por altura.
A = (B+b).h / 2

d) a área do quadrado que tem lado B.
A = lado * lado

e) a área do retângulo que tem lados A e B.
A = lado * lado

f) o perímetro do retângulo que tem lados A e B */

public class ex006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-- Digite os dados --");
        System.out.print("A: ");
        float ladoA = input.nextFloat();
        System.out.print("B: ");
        float ladoB = input.nextFloat();
        System.out.print("C: ");
        float ladoC = input.nextFloat();

        float areaTriangulo = (ladoA * ladoC) / 2;
        float areaCirculo = (float)Math.floor(Math.PI * Math.pow(ladoC, 2));
        float areaTrapezio = ((ladoA + ladoB) * ladoC) / 2;
        float areaQuadrado = (float)Math.pow(ladoB, 2);
        float areaRetangulo =  ladoA * ladoB;
        float perimetroRetangulo = ladoA + ladoA + ladoB + ladoB;
        
        System.out.println("-- RESULTADOS --");
        System.out.println("Área do triângulo retângulo que tem A por base e C por altura: " + areaTriangulo);
        System.out.println("Área do círculo de raio C: " + areaCirculo);
        System.out.println("Área do trapézio que tem A e B por bases e C por altura: " + areaTrapezio);
        System.out.println("Área do quadrado que tem lado B: " + areaQuadrado);
        System.out.println("Área do retângulo que que tem lados A e B: " + areaRetangulo);
        System.out.println("O perímetro do retângulo que tem lados A e B: " + perimetroRetangulo);

        input.close();
    }
}
