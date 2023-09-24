package listaexercicios02;
/* Escreva um programa que imprima todos os
múltiplos de 7 menores que 200. Use o laço WHILE. */
public class ex007 {
    public static void main(String[] args) {
        int i = 200;
        System.out.println("Múltiplos de 7 menores que 200: ");
        while(i > 0) {
            if(i %7 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
