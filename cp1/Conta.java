package cp1;

import java.util.Scanner;

public class Conta {
    private String nome;
    private String numConta;
    private double saldo;

    public Conta(String nome, String numConta) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            System.out.printf("Saldo: R$%.2f\n",  this.saldo);
        }
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            System.out.printf("Saldo: R$%.2f\n",  this.saldo);
        }
    }

    public void imprimirDados() {
        System.out.println("----- DADOS BANCÁRIOS -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Conta: " + getNumConta());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
    }

    public void transferir(Conta contaDestino, double valor) {
        contaDestino.depositar(valor);
    }

    public static void main(String[] args) {
        Conta c1 = new Conta("Patricia", "001");
        Conta c2 = new Conta("Sarita", "002");

        c1.depositar(300);
        c1.sacar(300);
        c1.imprimirDados();
        c1.transferir(c2, 200);
        c2.imprimirDados();

    }
}
