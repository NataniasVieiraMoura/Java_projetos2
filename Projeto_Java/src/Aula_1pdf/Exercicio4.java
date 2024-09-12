package Aula_1pdf;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        /*3) Crie uma expressão lógica para verificar se um estudante está
        apto para fazer uma prova final de matemática. O estudante
        precisa ter pelo menos 60% de presença nas aulas e ter uma
        média igual ou superior a 7.0 em todas as avaliações.*/
        Scanner sc = new Scanner(System.in);
        int presença = 0;
        System.out.println("Você deve vir nas 100 aulas.\nQuantas você veio? ");
        presença = sc.nextInt();
        System.out.println("Qual sua primeira nota? ");
        double not1 = sc.nextDouble();
        System.out.println("Qua sua segunda nota? ");
        double not2 = sc.nextDouble();
        double med = (not1+not2)/2;
        int res = 100 - presença;
        if(med >= 7.0 && res <= 40){
            System.out.println("Você está aprovado para fazer a prova final de matemática.");
        }
        else{
            System.out.println("Você não foi aprovado para fazer a prova final de matemática.");
        }
    }
}
