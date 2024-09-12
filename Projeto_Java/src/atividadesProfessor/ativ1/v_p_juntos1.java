package ativ1;

import java.util.Scanner;
public class v_p_juntos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("quantos anos você tem?");
        int idade = scanner.nextInt();

        System.out.print("quantas horas de praticas fez?");
        int horasPraticas = scanner.nextInt();

        System.out.print("quantas horas de teoricas fez");
        int horasTeoricas = scanner.nextInt();

        boolean idadeApta = idade >= 18;
        boolean horasTeoricasAptas = horasTeoricas >= 45;
        boolean horasPraticasAptas = horasPraticas >= 20;

        if (idadeApta && horasTeoricasAptas && horasPraticasAptas) {
            System.out.println("você está apto para fazer a prova de habilitação.");
        } else {
            System.out.println("você não cumpre um dos requisitos para realizar a prova.");
            if (!idadeApta) {
                System.out.println("sua idade é inferior a 18. Não pode fazer a prova.");
            }
            if (!horasTeoricasAptas) {
                System.out.println("você não tem as horas teóricas necessárias.");
            }
            if (!horasPraticasAptas) {
                System.out.println("você não tem as horas práticas necessárias.");
            }
        }
    }
    }
