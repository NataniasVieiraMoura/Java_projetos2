package Aula_1pdf;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*7) Desenvolva uma expressão lógica para verificar se um
aplicante está qualificado para uma bolsa de estudos. O aplicante
deve ter uma renda familiar per capita inferior a R$ 1.000,00, ter
concluído o ensino médio com média igual ou superior a 9.0 e ter
participado ativamente de atividades extracurriculares.*/
        System.out.println("Qual sua renda familiar per capita? ");
        double renda = sc.nextDouble();
        System.out.println("Você concluiu o ensino médio(sim/não)? ");
        String resp = sc.next();
        System.out.println("Qual a sua média escolar? ");
        double media = sc.nextDouble();
        System.out.println("Qual seu status de participação em atividades extracurriculares\n(ativo/moderado/passivo)?");
        String status = sc.next();
        if(renda <= 1000 && media >= 9 && resp.equals("sim") && status.equals("ativo")){
            System.out.println("Você foi aprovado para receber bolsa estudantil.");
        }
        else{
            System.out.println("Você não foi aprovado para receber bolsa estudantil.");
        }
    }
}
