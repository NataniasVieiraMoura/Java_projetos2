package Aula_1pdf;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        /*3) Crie uma express�o l�gica para verificar se um estudante est�
        apto para fazer uma prova final de matem�tica. O estudante
        precisa ter pelo menos 60% de presen�a nas aulas e ter uma
        m�dia igual ou superior a 7.0 em todas as avalia��es.*/
        Scanner sc = new Scanner(System.in);
        int presen�a = 0;
        System.out.println("Voc� deve vir nas 100 aulas.\nQuantas voc� veio? ");
        presen�a = sc.nextInt();
        System.out.println("Qual sua primeira nota? ");
        double not1 = sc.nextDouble();
        System.out.println("Qua sua segunda nota? ");
        double not2 = sc.nextDouble();
        double med = (not1+not2)/2;
        int res = 100 - presen�a;
        if(med >= 7.0 && res <= 40){
            System.out.println("Voc� est� aprovado para fazer a prova final de matem�tica.");
        }
        else{
            System.out.println("Voc� n�o foi aprovado para fazer a prova final de matem�tica.");
        }
    }
}
