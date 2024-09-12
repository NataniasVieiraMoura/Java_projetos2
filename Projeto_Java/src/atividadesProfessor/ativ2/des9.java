package ativ2;
import java.util.Scanner;
public class des9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[25];
        double somaNotas = 0;
        double maiorNota = 0;
        double menorNota = 0;
        for (int i = 0; i < 25; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
            if(i == 0){
                maiorNota = menorNota = notas[i];
            }
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }
        double mediaNotas = somaNotas / 25;
        System.out.println("\nRelatório de Notas");
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média das notas: " + mediaNotas);

        scanner.close();
    }
}
