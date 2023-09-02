/*Exemplo de como usar switch case */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=============");
        System.out.println("DIGITE UMA OPÇÃO" + System.lineSeparator() +
        "[1] Pesquisar usuário" + System.lineSeparator() + 
        "[2] Cadastrar usuário" + System.lineSeparator() +
        "[3] Abrir pedido" + System.lineSeparator() + 
        "[4] Fechar pedido" + System.lineSeparator() +
        "[0] Sair do programa" + System.lineSeparator());
        System.out.println("=============");
        
        int opcao = sc.nextInt();

        switch(opcao) {
            case 1:
            System.out.println("Pesquisar usuário");
            break;

            case 2:
            System.out.println("Cadastrar usuário");
            break;

            case 3:
            System.out.println("Abrir pedido");
            break;

            case 4:
            System.out.println("Fechar pedido");
            break;
            
            case 0:
            System.out.println("Saindo do programa...");
            break;

            default:
            System.out.println("Opção inválida");
        }

    }
}
