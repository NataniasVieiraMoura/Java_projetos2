package ativ1;
import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();
        System.out.print("Voc� possui diploma universit�rio (sim/n�o)? ");
        String diploma = scanner.next();
        System.out.print("Quantos anos de experi�ncia na �rea? ");
        int experiencia = scanner.nextInt();
        boolean idadeApta = idade >= 25;
        boolean diplomaApto = diploma.equalsIgnoreCase("sim");
        boolean experienciaApta = experiencia >= 3;
        if (idadeApta && diplomaApto && experienciaApta) {
            System.out.println("Voc� est� qualificado para trabalhar na �rea.");
        } else {
            System.out.println("Voc� n�o cumpre os requisitos para trabalhar na �rea.");
        }
    }
}

