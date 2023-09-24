package listaexercicios02;
/* Calcular e mostrar a média aritmética dos números pares compreendidos
entre 13 e 73. Utilize o laço que lhe for mais conveniente.
*/

public class ex008 {
    public static void main(String[] args) {
    int soma = 0, cont = 0;

        for(int i = 13; i <= 73; i++) {
            if(i %2 == 0) {
                soma += i;
                cont++;
            }
        }

        int media = soma / cont;

        System.out.println("Quantidade de números pares: " + cont);
        System.out.println("Soma total dos números pares: " + soma);
        System.out.println("Média aritmética dos números: " + media);
    }
}
