package listaexercicios01;

import java.util.Scanner;

/*Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a 
mensagem "Numero negativo" */

public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if(numero > 0) {
            System.out.print("Número digitado: " + numero);
        } else if (numero == 0) {
            System.out.print("O número " + numero + " é neutro.");
        } else {
            System.out.print("O número " + numero + " é negativo.");
        }  
    }
}
