package ativ1;
import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();
        System.out.print("Você possui diploma universitário (sim/não)? ");
        String diploma = scanner.next();
        System.out.print("Quantos anos de experiência na área? ");
        int experiencia = scanner.nextInt();
        boolean idadeApta = idade >= 25;
        boolean diplomaApto = diploma.equalsIgnoreCase("sim");
        boolean experienciaApta = experiencia >= 3;
        if (idadeApta && diplomaApto && experienciaApta) {
            System.out.println("Você está qualificado para trabalhar na área.");
        } else {
            System.out.println("Você não cumpre os requisitos para trabalhar na área.");
        }
    }
}

