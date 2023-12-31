package listaexercicios02;
import java.util.Scanner;

/* Faça um programa que leia um número natural N e calcule
a soma abaixo (lembre-se de que tanto as divisões quanto
o resultado devem ser decimais). Utilize o laço que lhe
for mais conveniente. */
public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();
        float soma = 1f;
        float numerador = 1f;
        float denominador = 1f;

        for (int i = 1; i <= n; i++) {
            numerador *= i;
            denominador *= (2 * i - 1);
            soma += numerador / denominador;
        }

        System.out.printf("Resultado: %.2f", soma);
    }
}
