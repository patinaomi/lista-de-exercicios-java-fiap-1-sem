package listaexercicios02;

import java.util.Scanner;

/* Leia um valor inteiro N. Este valor será a quantidade de
 valores que serão lidos em seguida do usuário. Para cada valor lido,
 mostre uma mensagem em português dizendo se este valor lido é par (PAR),
 ímpar (ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso
 do valor ser igual a zero (0), seu programa deverá imprimir apenas
 NULO. Utilize o laço DO-WHILE.
 */
public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.print("\nDigite um número: ");
            op = input.nextInt();

            if(op == 0) {
                System.out.printf("O número %d é nulo.", op);
                break;
            }

            if(op %2 == 0) {
                System.out.printf("O número %d é PAR ", op);
            } else {
                System.out.printf("O número %d é ÍMPAR ", op);
            }

            if(op > 0) {
                System.out.print("e POSITIVO.");
            } else {
                System.out.print("e NEGATIVO.");
            }
            
        } while(op != 0);

    }
}
