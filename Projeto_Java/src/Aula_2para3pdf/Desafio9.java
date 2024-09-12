package Aula_2para3pdf;
import java.util.Scanner;
public class Desafio9 {
    public static void main(String[] args) {
        /*Crie um programa para ler a altura de 12 atletas de basquete.
                Apresente no final quantos têm mais de 1.90.*/
        Scanner sc = new Scanner(System.in);
        double alt = 0;
        int cont = 0;
        for(int x = 1; x<= 12;x++){
            System.out.println("Qual a altura do "+x+"ª jogador? ");
            alt = sc.nextDouble();
            if(alt > 1.90){
                cont++;
            }
        }
        System.out.println("A quantidade de jogadores maiores que 1.90 é de "+cont);
    }
}
