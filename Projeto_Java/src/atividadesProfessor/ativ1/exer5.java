package ativ1;
import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantas compras voc� fez? ");
            int compras = scanner.nextInt();
            System.out.print("Nos �ltimos quantos meses? ");
            int meses = scanner.nextInt();
            System.out.print("Quanto voc� gastou nessas compras desse per�odo? ");
            double valorTotal = scanner.nextDouble();
            boolean comprasAptas = compras >= 5;
            boolean mesesAptos = meses == 3;
            boolean valorApto = valorTotal > 500;
            if (comprasAptas && mesesAptos && valorApto) {
                System.out.println("Voc� receber� desconto de 50%.");
            } else {
                System.out.println("Voc� n�o est� apto para receber o desconto.");
        }
    }
}
