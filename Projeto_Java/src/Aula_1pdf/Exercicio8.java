package Aula_1pdf;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*7) Desenvolva uma express�o l�gica para verificar se um
aplicante est� qualificado para uma bolsa de estudos. O aplicante
deve ter uma renda familiar per capita inferior a R$ 1.000,00, ter
conclu�do o ensino m�dio com m�dia igual ou superior a 9.0 e ter
participado ativamente de atividades extracurriculares.*/
        System.out.println("Qual sua renda familiar per capita? ");
        double renda = sc.nextDouble();
        System.out.println("Voc� concluiu o ensino m�dio(sim/n�o)? ");
        String resp = sc.next();
        System.out.println("Qual a sua m�dia escolar? ");
        double media = sc.nextDouble();
        System.out.println("Qual seu status de participa��o em atividades extracurriculares\n(ativo/moderado/passivo)?");
        String status = sc.next();
        if(renda <= 1000 && media >= 9 && resp.equals("sim") && status.equals("ativo")){
            System.out.println("Voc� foi aprovado para receber bolsa estudantil.");
        }
        else{
            System.out.println("Voc� n�o foi aprovado para receber bolsa estudantil.");
        }
    }
}
