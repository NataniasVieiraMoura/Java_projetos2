package ativ1;

import java.util.Scanner;
public class v_p_juntos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("quantos anos voc� tem?");
        int idade = scanner.nextInt();

        System.out.print("quantas horas de praticas fez?");
        int horasPraticas = scanner.nextInt();

        System.out.print("quantas horas de teoricas fez");
        int horasTeoricas = scanner.nextInt();

        boolean idadeApta = idade >= 18;
        boolean horasTeoricasAptas = horasTeoricas >= 45;
        boolean horasPraticasAptas = horasPraticas >= 20;

        if (idadeApta && horasTeoricasAptas && horasPraticasAptas) {
            System.out.println("voc� est� apto para fazer a prova de habilita��o.");
        } else {
            System.out.println("voc� n�o cumpre um dos requisitos para realizar a prova.");
            if (!idadeApta) {
                System.out.println("sua idade � inferior a 18. N�o pode fazer a prova.");
            }
            if (!horasTeoricasAptas) {
                System.out.println("voc� n�o tem as horas te�ricas necess�rias.");
            }
            if (!horasPraticasAptas) {
                System.out.println("voc� n�o tem as horas pr�ticas necess�rias.");
            }
        }
    }
    }
