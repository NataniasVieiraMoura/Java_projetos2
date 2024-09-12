package ativ3.ativ2;
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
        public String getNomeTitular() {
            return nomeTitular;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void exibirInformacoes() {
            System.out.println("Nome do Titular: " + nomeTitular);
            System.out.println("Número da Conta: " + numero);
            System.out.println("Saldo: " + saldo);
        }

        public static void main(String[] args) {
            Conta conta = new Conta("João Silva", 12345, 1000.0);
            conta.exibirInformacoes();
            if (conta.sacar(200.0)) {
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
            conta.depositar(500.0);
            System.out.println("Depósito realizado com sucesso.");
            conta.exibirInformacoes();
        }
}