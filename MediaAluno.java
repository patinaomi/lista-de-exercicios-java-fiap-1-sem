import java.util.Scanner;

public class MediaAluno {

    /* Ex 001 - Escreva uma classe para ler o nome de um aluno e calcular a média final
    considerando que a mesma será composta por 4 notas: n1, n2, n3 e n4. Ao final, o programa
    deve imprimir o nome do aluno e a média final calculada.
        1. Identifique os dados de entrada
        2. Qual será o processamento realizado
        3. Quais são os dados de saída
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a nota 1: ");
        float n1 = input.nextFloat();        
        System.out.print("Digite a nota 2: ");
        float n2 = input.nextFloat();        
        System.out.print("Digite a nota 3: ");
        float n3 = input.nextFloat();        
        System.out.print("Digite a nota 4: ");
        float n4 = input.nextFloat(); 
        
        input.close();
        
        float media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("Aluno(a) %s, média final: %.2f.", nome, media);
    }

}
