package ativ1;
import java.util.Scanner;
public class exer0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética das notas é: " + media);
    }
}
