package Aula_1pdf;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Vamos_pensar_juntos1 {
    /*Monte uma express�o l�gica para verificar se uma pessoa est� apta para
realizar a prova da carteira de habilita��o para motos. O(A) candidato(a)
precisa ter 18 anos e ter assistido a 45 horas de aula te�rica e 20 horas
de aula pr�tica.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Quantas horas pr�ticas voc� t�m? ");
        int horasp = sc.nextInt();
        System.out.println("Quantas horas teoricas voc� t�m? ");
        int horast = sc.nextInt();
        if(idade >= 18 && horast >= 45 && horasp >= 20){
            System.out.println("Voc� est�  apto para fazer a prova de habilita��o");
        }
        else{
            System.out.println("Voc� n�o cumpre um dos requisitos para realizar a prova");
            if(idade < 18){
                System.out.println("Sua idade � inferior a 18. N�o pode fazer a prova.");
            }
            if(horast < 45 || horasp < 20){
                System.out.println("Voc� n�o tem horas assistidas necess�rias");
            }
        }
    }
}
