package listaexercicios01;
   
/*Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao expoente).
Exemplo: 5 elevado ao cubo ficaria Math.pow(5,3). Você pode trocar esses números por variáveis. */

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = input.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();

        int resultado = (int)Math.pow(base,expoente);

        System.out.printf("RESULTADO: %d elevado a %d = %d", base, expoente, resultado);

        input.close();
    }
}
