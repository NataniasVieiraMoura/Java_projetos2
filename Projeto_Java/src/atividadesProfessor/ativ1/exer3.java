package ativ1;
import java.util.Scanner;
public class exer3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual a sua porcentagem de presen�a nas aulas? ");
            double presenca = scanner.nextDouble();
            System.out.print("Qual a sua m�dia em todas as avalia��es? ");
            double media = scanner.nextDouble();
            boolean presencaApta = presenca >= 60.0;
            boolean mediaApta = media >= 7.0;
            if (presencaApta && mediaApta) {
                System.out.println("Voc� est� apto para fazer a prova final de matem�tica.");
            } else {
                System.out.println("Voc� n�o est� apto para fazer a prova final de matem�tica.");
            }
        }
}
