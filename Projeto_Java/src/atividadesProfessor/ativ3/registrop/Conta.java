package atividadesProfessor.ativ3.registrop;
import java.util.ArrayList;
import java.util.Scanner;
class Conta {
        private static int contadorDeContas = 1;
        private int numero;
        private String titular;
        private double saldo;
        public Conta(String titular, double saldoInicial) {
            this.numero = contadorDeContas++;
            this.titular = titular;
            this.saldo = saldoInicial;
        }
        public int getNumero() {
            return numero;
        }
        public String getTitular() {
            return titular;
        }
        public double getSaldo() {
            return saldo;
        }
        public void depositar(double valor) {
            saldo += valor;
        }
        public boolean sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                return true;
            }
            return false;
        }
    }

