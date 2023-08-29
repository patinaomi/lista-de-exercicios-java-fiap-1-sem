package listaexercicios01;

//Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero1 = input.nextFloat();
        System.out.print("Digite um número: ");
        float numero2 = input.nextFloat();
        
        if(numero1 > numero2) {
            System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        } else {
            System.out.println("Resultado: " + numero2 + " / " + numero1 + " = " + (numero2 / numero1));
        }

        input.close();
    }
}
