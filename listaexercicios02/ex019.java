package listaexercicios02;

import java.util.Scanner;

/* Escreva um programa que repita a leitura de uma senha até que ela
 seja válida. Para cada leitura de senha incorreta informada, escrever
 a mensagem "Senha Invalida". Quando a senha for informada corretamente
 deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
 Considere que a senha correta é o valor 2002. Utilize o laço que lhe
 for mais conveniente.
 */

public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        int tentativas = 3;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

            if(senha == 2002) {
                System.out.println("Acesso Permitido!");
            } else {
                tentativas--;

            if(tentativas == 0) {
                System.out.println("Usuário BLOQUEADO!");
                break;
            }
                System.out.printf("Acesso negado, você tem mais %d tentativas.\n", tentativas);
            }

        } while(senha!=2002);
    }
}
