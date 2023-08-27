package listaexercicios01;

/* Escreva um programa que leia o número de cadastro de um funcionário, seu número de
horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre na tela o número e o salário do funcionário. */

import java.util.Scanner;

public class ex009 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de cadastro do funcionário: ");
        int numCadastro = input.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrab = input.nextInt();
        System.out.print("Digita o valor do salário por hora: ");
        float salarioHora = input.nextFloat();

        float salarioTotal = horasTrab * salarioHora;

        System.out.printf("Funcionário 00%d: salário de R$%.2f", numCadastro, salarioTotal);

        input.close();
    }
}
