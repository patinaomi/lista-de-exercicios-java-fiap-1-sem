package listaexercicios01;

/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a
mensagem "Valores aceitos", senão escrever "Valores não aceitos". */

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor de A: ");
    int a = input.nextInt();
    System.out.print("Digite o valor de B: ");
    int b = input.nextInt();
    System.out.print("Digite o valor de C: ");
    int c = input.nextInt();
    System.out.print("Digite o valor de D: ");
    int d = input.nextInt();

    if((b > c) && (d > a) && ((c + d) > (a + b)) && (c > 0) && (d > 0) && (a%2==0)) {
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores não aceitos");
    }
    
    input.close();
    }
}
    