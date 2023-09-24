package listaexercicios02;
/* Faça um programa para ler e escrever dados de uma turma de 5 alunos.
O programa deve pedir dados como nome, idade e sexo.
O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE. */

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        int i = 1, idadeAluno = 0;
        String nomeAluno = "", sexoAluno = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("==== DADOS ALUNO ====");
            System.out.print("Digite o nome do aluno: ");
            String nome = input.next();
            System.out.print("Digite a idade do aluno: ");
            int idade = input.nextInt();
            System.out.print("Digite o sexo do aluno (F/M): ");
            String sexo = input.next();

            if(i == 1) {
                nomeAluno = nome;
                idadeAluno = idade;
                sexoAluno = sexo;
            } else {
                if(idade > idadeAluno) {
                    nomeAluno = nome;
                    idadeAluno = idade;
                    sexoAluno = sexo;
                }
            }
            i++;
        } while(i <= 5);

        System.out.println("Dados do aluno mais velho: ");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Sexo: " + sexoAluno);

    }
}
