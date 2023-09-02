/* Crie um programa Java para ler um número inteiro para determinar se o número é par ou ímpar */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = sc.nextInt();

    if(numero %2 == 0) {
        System.out.printf("O número %d é par.", numero);
    } else {
        System.out.printf("O número %d é ímpar.", numero);
    }
    
    }

}
