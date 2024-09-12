package ativ1;
import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantas compras você fez? ");
            int compras = scanner.nextInt();
            System.out.print("Nos últimos quantos meses? ");
            int meses = scanner.nextInt();
            System.out.print("Quanto você gastou nessas compras desse período? ");
            double valorTotal = scanner.nextDouble();
            boolean comprasAptas = compras >= 5;
            boolean mesesAptos = meses == 3;
            boolean valorApto = valorTotal > 500;
            if (comprasAptas && mesesAptos && valorApto) {
                System.out.println("Você receberá desconto de 50%.");
            } else {
                System.out.println("Você não está apto para receber o desconto.");
        }
    }
}
