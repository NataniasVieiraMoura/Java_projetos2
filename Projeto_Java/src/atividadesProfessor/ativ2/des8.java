package ativ2;
import java.util.Scanner;
public class des8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] alturas = new double[12];
            int contadorAltos = 0;
            for (int i = 0; i < 12; i++) {
                System.out.print("Digite a altura do atleta " + (i + 1) + " em metros: ");
                alturas[i] = scanner.nextDouble();
                if (alturas[i] > 1.90) {
                    contadorAltos++;
                }
            }
            System.out.println("\nNúmero de atletas com mais de 1,90 metros: " + contadorAltos);

            scanner.close();
        }
    }
