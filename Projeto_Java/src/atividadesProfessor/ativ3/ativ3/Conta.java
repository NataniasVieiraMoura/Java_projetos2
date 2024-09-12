package ativ3.ativ3;
import java.util.Scanner;

public class Conta {
    private String nomeTitular;
    private int numero;
    private double saldo;
    public Conta(String nomeTitular, int numero, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    public void exibir() {
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
    public double verSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Exibir Informações da Conta");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    scanner.nextLine(); // Consumir a nova linha
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numero = scanner.nextInt();
                    System.out.print("Digite o saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    conta = new Conta(nome, numero, saldoInicial);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    if (conta != null) {
                        System.out.print("Digite o valor para depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;
                case 3:
                    if (conta != null) {
                        System.out.print("Digite o valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        if (conta.sacar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente ou valor inválido.");
                        }
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;
                case 4:
                    if (conta != null) {
                        System.out.println("Saldo atual: " + conta.verSaldo());
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;
                case 5:
                    if (conta != null) {
                        conta.exibir();
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;
                case 6:
                    if (conta != null) {
                        System.out.println("Encerrando o programa. Informações da conta:");
                        conta.exibir();
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}



