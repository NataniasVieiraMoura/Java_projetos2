package Aula_1pdf;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        /*6) Crie uma express�o l�gica para determinar se um estudante
est� apto a participar de um programa de interc�mbio. O
estudante deve ter pelo menos 18 anos, falar fluentemente o
idioma do pa�s de destino e possuir uma m�dia m�nima de 8.0 em
todas as disciplinas.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Qual seu n�vel de flu�ncia de ingl�s(b�sico,avan�ado)? ");
        String nivel = sc.next();
        System.out.println("Qua sua m�dia de notas de todas as suas disciplinas? ");
        double media = sc.nextDouble();
        if(idade>=18 && nivel.equals("avan�ado") && media >=8){
            System.out.println("Voc� foi aprovado para ingressar no programa de interc�nbio, parab�ns.");
        }
        else{
            System.out.println("Voc� n�o cumpre os requisitos para ingressar.");
        }
    }
}
