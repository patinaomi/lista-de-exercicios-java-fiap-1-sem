package listaexercicios02;
/* Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 Depois disso, o programa deve ler as notas de cada um destes alunos, calcular
 e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE.
 */

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        float total = 0;

        System.out.print("Digite a quantidade de alunos: ");
        int cont = input.nextInt();

        while(i <= cont) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            float nota = input.nextFloat();
            total += nota;
            i++;

        }

        float media = total / cont;

        System.out.println("Número total de alunos: " + cont);
        System.out.println("Média dos alunos: " + media);
    }
}
