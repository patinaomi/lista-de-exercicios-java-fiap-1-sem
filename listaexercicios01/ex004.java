package listaexercicios01;

/*Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. 
Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2.
-9 é consecutivo de -9 */

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite um número: ");
      int numero1 = input.nextInt();
      System.out.print("Digite um número: ");
      int numero2 = input.nextInt();

      int numConsecutivo1 = numero1 + 1;
      int numConsecutivo2 = numero2 + 1;

      System.out.printf("\nNúmeros digitados: %d e %d.", numero1, numero2);
      System.out.printf("\nNúmeros consecutivos: %d e %d.", numConsecutivo1, numConsecutivo2);

      input.close();
    }
}
