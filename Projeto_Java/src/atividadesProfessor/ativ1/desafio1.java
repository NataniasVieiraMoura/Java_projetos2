package ativ1;
import java.util.Scanner;
public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("Quando você nasceu? ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Qual a sua cidade natal? ");
        String cidadeNatal = scanner.nextLine();
        System.out.println("Olá Sr(a) " + nome + ". Você nasceu no ano de " + anoNascimento + ". Você é da cidade de " + cidadeNatal + ".");
    }
}
