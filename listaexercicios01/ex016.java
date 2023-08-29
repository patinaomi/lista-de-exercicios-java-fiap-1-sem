package listaexercicios01;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.  */

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = input.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = input.nextInt();

        int resultado = horaFinal - horaInicial;

        if(resultado <=0) {
            resultado += 24;
            System.out.println("O jogo durou " + resultado + " horas.");
        } else {
            System.out.println("O jogo durou " + resultado + " horas.");
        }

        input.close();
    }
}
