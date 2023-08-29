package listaexercicios01;

import java.util.Scanner;

/*Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado 
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo". */

public class ex012 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida de L: ");
        float lado = input.nextFloat();
        System.out.print("Digite o raio R: ");
        float raio = input.nextFloat();

        float areaQuadrado = (float)Math.pow(lado, 2);
        float areaCirculo = (float)Math.floor(Math.PI * Math.pow(raio, 2));

        if(areaQuadrado > areaCirculo) {
            System.out.println("A área do quadrado é maior.");
        } else {
            System.out.println("A área do círculo é maior.");
        }
        
        input.close();
    }
}
