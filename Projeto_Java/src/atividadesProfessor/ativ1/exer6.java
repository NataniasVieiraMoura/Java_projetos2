package ativ1;
import java.util.Scanner;
public class exer6 {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual a sua idade? ");
            int idade = scanner.nextInt();
            System.out.print("Qual seu n�vel de flu�ncia de ingl�s (b�sico/avan�ado)? ");
            String nivelFluencia = scanner.next();
            System.out.print("Qual a sua m�dia de notas em todas as disciplinas? ");
            double mediaNotas = scanner.nextDouble();
            boolean idadeApta = idade >= 18;
            boolean fluenciaApta = nivelFluencia.equalsIgnoreCase("avan�ado");
            boolean mediaApta = mediaNotas >= 8.0;

            if (idadeApta && fluenciaApta && mediaApta) {
                System.out.println("Voc� foi aprovado para ingressar no programa de interc�mbio, parab�ns!");
            } else {
                System.out.println("Voc� n�o cumpre os requisitos para ingressar.");
            }
        }
    }
