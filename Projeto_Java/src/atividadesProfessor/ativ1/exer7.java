package ativ1;
import java.util.Scanner;
public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual sua renda familiar per capita? ");
        double renda = scanner.nextDouble();
        System.out.print("Você concluiu o ensino médio (sim/não)? ");
        String ensinoMedio = scanner.next();
        System.out.print("Qual a sua média escolar? ");
        double media = scanner.nextDouble();
        System.out.print("Qual seu status de participação em atividades extracurriculares (ativo/moderado/passivo)? ");
        String statusAtividades = scanner.next();
        boolean rendaApta = renda < 1000;
        boolean ensinoMedioConcluido = ensinoMedio.equalsIgnoreCase("sim");
        boolean mediaApta = media >= 9;
        boolean atividadesAptas = statusAtividades.equalsIgnoreCase("ativo");
        if (rendaApta && ensinoMedioConcluido && mediaApta && atividadesAptas) {
            System.out.println("Você foi aprovado para receber bolsa estudantil.");
        } else {
            System.out.println("Você não foi aprovado para receber bolsa estudantil.");
        }

    }
}
