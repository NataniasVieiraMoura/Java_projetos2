package ativ1;
import java.util.Scanner;
public class exer6 {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual a sua idade? ");
            int idade = scanner.nextInt();
            System.out.print("Qual seu nível de fluência de inglês (básico/avançado)? ");
            String nivelFluencia = scanner.next();
            System.out.print("Qual a sua média de notas em todas as disciplinas? ");
            double mediaNotas = scanner.nextDouble();
            boolean idadeApta = idade >= 18;
            boolean fluenciaApta = nivelFluencia.equalsIgnoreCase("avançado");
            boolean mediaApta = mediaNotas >= 8.0;

            if (idadeApta && fluenciaApta && mediaApta) {
                System.out.println("Você foi aprovado para ingressar no programa de intercâmbio, parabéns!");
            } else {
                System.out.println("Você não cumpre os requisitos para ingressar.");
            }
        }
    }
