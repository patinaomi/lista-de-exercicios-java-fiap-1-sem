/*
 * A) Prova semestral que compõe 50% da média;
 * B) Trabalho de conclusão de curso que possui 30%;
 * C) As avaliações intermediárias, que são compostas por duas avaliações durante o semestre e a médiia dessas duas avaliações contribuem com 20% para a média final.
 */

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine();
        System.out.print("Nota prova semestral: ");
        float provaSemestral = input.nextFloat();
        System.out.print("Nota TCC: ");
        float notaTcc = input.nextFloat();
        System.out.print("Nota avaliação 1: ");
        float notaAv1 = input.nextFloat();
        System.out.print("Nota avaliação 2: ");
        float notaAv2 = input.nextFloat();

        float mediaFinal = (float) (provaSemestral * 0.5 + notaTcc * 0.3 + ((notaAv1 + notaAv2) / 2) * 0.2);

        System.out.printf("Aluno: %s\nMédia Final: %.2f", nomeAluno, mediaFinal);

        if(mediaFinal>= 6) {
            System.out.println("Situação: APROVADO(A).");
        } else if(mediaFinal >= 5) {
            System.out.println("Situação: EXAME.");
        } else {
            System.out.println("Situação: REPROVADO(A)");
        }

    }
}
