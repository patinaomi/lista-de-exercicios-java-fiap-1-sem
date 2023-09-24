package listaexercicios02;
/* Faça um programa que calcule e imprima o resultado da soma abaixo
(lembre-se de que tanto as divisões quanto o
resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
 */
public class ex010 {
    public static void main(String[] args) {
        float total = 0;

        for(int i=1; i<= 20; i++) {
            total += ((float) 1/i);
            System.out.printf("Loop %d: %f\n",i, total);
        }
        System.out.println("Total da soma: " + total);
    }

}
