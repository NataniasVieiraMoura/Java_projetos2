package ativ2;
import java.util.Scanner;
public class des2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaioresQue50 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 50) {
                contadorMaioresQue50++;
            }
        }
        System.out.println("\nQuantidade de números maiores que 50: " + contadorMaioresQue50);
    }
}
