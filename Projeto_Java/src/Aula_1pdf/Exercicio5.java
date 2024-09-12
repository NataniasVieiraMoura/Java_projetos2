package Aula_1pdf;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        /*4) Desenvolva uma expressão lógica para determinar se um
        candidato está qualificado para um emprego. O candidato deve
        ter pelo menos 25 anos de idade, possuir um diploma
        universitário e ter pelo menos três anos de experiência de
        trabalho na área relacionada.*/
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        String dip = "não";
        int xp = 0;
        System.out.println("Qual a sua idade? ");
        idade = sc.nextInt();
        System.out.println("Você possui diploma? ");
        dip = sc.next();
        System.out.println("Quantos anos de experiência na area? ");
        xp = sc.nextInt();
        if(dip.equals("sim") && idade >= 25 && xp >= 3){
            System.out.println("Você está qualificado para trabalhar na área.");
            }
        else{
            System.out.println("Você não cumpre os requisitos para trabalhar na área.");
        }
    }
}
