package Aula_1pdf;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        /*4) Desenvolva uma express�o l�gica para determinar se um
        candidato est� qualificado para um emprego. O candidato deve
        ter pelo menos 25 anos de idade, possuir um diploma
        universit�rio e ter pelo menos tr�s anos de experi�ncia de
        trabalho na �rea relacionada.*/
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        String dip = "n�o";
        int xp = 0;
        System.out.println("Qual a sua idade? ");
        idade = sc.nextInt();
        System.out.println("Voc� possui diploma? ");
        dip = sc.next();
        System.out.println("Quantos anos de experi�ncia na area? ");
        xp = sc.nextInt();
        if(dip.equals("sim") && idade >= 25 && xp >= 3){
            System.out.println("Voc� est� qualificado para trabalhar na �rea.");
            }
        else{
            System.out.println("Voc� n�o cumpre os requisitos para trabalhar na �rea.");
        }
    }
}
