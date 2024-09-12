package ativ2;
import java.util.Scanner;
public class des7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = 2024;
        int numeroSequencial = 1;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o nome da(o) cliente: ");
            String nome = scanner.nextLine();
            String matricula = String.format("%02d%02d", anoAtual % 100, numeroSequencial);
            numeroSequencial++;
            System.out.println("A matrícula da(o) " + nome + " é " + matricula);
        }
    }
}
