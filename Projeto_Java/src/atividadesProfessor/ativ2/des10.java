package ativ2;
import java.util.Scanner;
public class des10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] saques = new double[10];
            double totalSacado = 0;
            double maiorSaque = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("****** Bem-vindo ao Caixa eletrônico ******");
                System.out.print("Qual valor deseja sacar: ");
                saques[i] = scanner.nextDouble();
                totalSacado += saques[i];
                if (saques[i] > maiorSaque) {
                    maiorSaque = saques[i];
                }
            }
            double mediaSaques = totalSacado / 10;
            System.out.println("\nRelatório do dia");
            System.out.println("Maior valor sacado: " + maiorSaque);
            System.out.println("Média do valor sacado: " + mediaSaques);
            System.out.println("Total de valor sacado: " + totalSacado);
        }
    }
