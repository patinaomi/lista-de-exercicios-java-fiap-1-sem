package listaexercicios02;
/* Faça um programa que mostre todos os números inteiros de 1 a 50.
Use o laço WHILE. */
public class ex001 {
    public static void main(String[] args) {
        int num = 1;
        System.out.print("Números de 1 ao 50: ");

        while(num <= 50) {
            System.out.printf("%d, ",num);
            num++;
        }

    }
}
