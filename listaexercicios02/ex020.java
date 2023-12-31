package listaexercicios02;

import java.util.Scanner;

/* Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de operações de
depósito e saque. O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque. Após digitar o
código da operação, o usuário deve digitar o valor. As operações devem continuar sendo realizadas até que o usuário
digite o código de operação “3”. Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser
impresso com as seguintes mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for
negativo) ou CONTA PREFERENCIAL (se o saldo for positivo). Utilize o laço DO-WHILE. */
public class ex020 {
    // Classe contaBancaria
    private String agencia;
    private String conta;
    private double saldo;

    public ex020() {
        setAgencia("0001");
        setConta();
        setSaldo(0);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta() {
        int digVerificador = (int) (Math.random() * 100);
        String num = String.format("%02d", digVerificador);
        this.conta = "123-" + num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public void realizarDeposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
        }
        System.out.printf("R$ %.2f%n", this.saldo);
    }

    public void realizarSaque(double valor) {

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
        System.out.printf("R$ %.2f%n", this.saldo);
    }

    public void statusConta() {
        if (this.saldo > 0) {
            System.out.println("Conta Preferencial");
        } else if (this.saldo < 0) {
            System.out.println("Conta Estourada");
        } else {
            System.out.println("Conta Zerada");
        }
    }
    public void extratoBancario() {
        System.out.println("--- DADOS BANCÁRIOS ---");
        System.out.println("Agência: " + getAgencia());
        System.out.println("Conta: " + getConta());
        System.out.println("Saldo: R$" + getSaldo());
        statusConta();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex020 c1 = new ex020();
        int op = 0;
        double valor = 0;

        do {
            System.out.println("--------- BANCO DA JAPA ---------");
            System.out.println("[1] Realizar um depósito");
            System.out.println("[2] Realizar um saque");
            System.out.println("[3] Sair do programa");
            System.out.print("Digite uma opção: ");
            op = input.nextInt();

            switch(op) {
                case 1:
                    System.out.println("***** DEPÓSITO *****");
                    System.out.print("Valor do depósito: ");
                    valor = input.nextDouble();
                    c1.realizarDeposito(valor);
                    break;
                case 2:
                    System.out.println("***** SAQUE *****");
                    System.out.print("Valor do saque: ");
                    valor = input.nextDouble();
                    c1.realizarSaque(valor);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    c1.extratoBancario();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while(op != 3);
        input.close();
    }
}
