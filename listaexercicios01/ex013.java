package listaexercicios01;

import java.util.Scanner;

/*Fazer um algoritmo que leia três números e imprime o maior deles. */
public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = input.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é " + numero2);
        } else {
            System.out.println("O maior número é " + numero3);
        }
        input.close();
    }
    
}
