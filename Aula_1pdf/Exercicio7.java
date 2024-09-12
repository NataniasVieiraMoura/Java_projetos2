package Aula_1pdf;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        /*6) Crie uma expressão lógica para determinar se um estudante
está apto a participar de um programa de intercâmbio. O
estudante deve ter pelo menos 18 anos, falar fluentemente o
idioma do país de destino e possuir uma média mínima de 8.0 em
todas as disciplinas.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Qual seu nível de fluência de inglês(básico,avançado)? ");
        String nivel = sc.next();
        System.out.println("Qua sua média de notas de todas as suas disciplinas? ");
        double media = sc.nextDouble();
        if(idade>=18 && nivel.equals("avançado") && media >=8){
            System.out.println("Você foi aprovado para ingressar no programa de intercânbio, parabéns.");
        }
        else{
            System.out.println("Você não cumpre os requisitos para ingressar.");
        }
    }
}
