package listaexercicios01;

//Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int lado = input.nextInt();

        int areaQuadrado = (int) Math.pow(lado, 2);

        System.out.printf("A área do quadrado é %d.", areaQuadrado);

        input.close();
    }
}
