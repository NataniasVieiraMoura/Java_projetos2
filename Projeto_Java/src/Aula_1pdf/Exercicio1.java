package Aula_1pdf;
import java.util.Scanner;
public class Exercicio1 {
    /*Exerc�cios:
Crie um algoritmo com os valores das notas da primeira prova e da
segunda prova de um aluno e apresente a m�dia aritm�tica do aluno.
*/
    public static void main(String[] args) {
        //O java l� com v�rgula e mostra com ponto!
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double not1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double not2 = sc.nextDouble();
        double med = (not1+not2)/2;
        System.out.println("Sua m�dia � :"+med);
    }
}
