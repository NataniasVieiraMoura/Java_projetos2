package atividadesProfessor.ativ3.registrop;
import java.util.ArrayList;
import java.util.Scanner;
public class Banco {
        private static ArrayList<Conta> contas = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            while (true) {
                System.out.println("Digite 1 para criar uma conta, 2 para ver o saldo de uma conta, 3 para sacar, 4 para depositar, outro número para finalizar:");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 1) {
                    criarConta();
                } else if (opcao == 2) {
                    verSaldo();
                } else if (opcao == 3) {
                    sacar();
                } else if (opcao == 4) {
                    depositar();
                } else {
                    break;
                }
            }
        }
        private static void criarConta() {
            System.out.println("Digite o nome do titular:");
            String titular = scanner.nextLine();
            System.out.println("Digite o saldo inicial:");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine();
            Conta novaConta = new Conta(titular, saldoInicial);
            contas.add(novaConta);

            System.out.println("Conta criada com sucesso! Número da conta: " + novaConta.getNumero());
        }
        private static void verSaldo() {
            Conta conta = localizarConta();
            if (conta != null) {
                System.out.println("Saldo da conta " + conta.getNumero() + ": " + conta.getSaldo());
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
        private static void sacar() {
            Conta conta = localizarConta();
            if (conta != null) {
                System.out.println("Digite o valor a ser sacado:");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                if (conta.sacar(valor)) {
                    System.out.println("Saque realizado com sucesso! Saldo atual: " + conta.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
        private static void depositar() {
            Conta conta = localizarConta();
            if (conta != null) {
                System.out.println("Digite o valor a ser depositado:");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                conta.depositar(valor);
                System.out.println("Depósito realizado com sucesso! Saldo atual: " + conta.getSaldo());
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
        private static Conta localizarConta() {
            System.out.println("Digite o número da conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();
            for (Conta conta : contas) {
                if (conta.getNumero() == numero) {
                    return conta;
                }
            }
            return null;
        }
    }

