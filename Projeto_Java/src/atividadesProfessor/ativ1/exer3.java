package ativ1;
import java.util.Scanner;
public class exer3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual a sua porcentagem de presença nas aulas? ");
            double presenca = scanner.nextDouble();
            System.out.print("Qual a sua média em todas as avaliações? ");
            double media = scanner.nextDouble();
            boolean presencaApta = presenca >= 60.0;
            boolean mediaApta = media >= 7.0;
            if (presencaApta && mediaApta) {
                System.out.println("Você está apto para fazer a prova final de matemática.");
            } else {
                System.out.println("Você não está apto para fazer a prova final de matemática.");
            }
        }
}
