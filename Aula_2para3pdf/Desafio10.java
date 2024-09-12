package Aula_2para3pdf;
import java.util.Scanner;
public class Desafio10 {
    public static void main(String[] args) {
        /*Crie um programa para ler a nota de 25 alunos de uma turma
        de lógica de programação. Apresente no final da leitura a
        maior nota, a menor nota e a média das notas.*/
        Scanner sc = new Scanner(System.in);
        double nota = 0, media = 0, maior = 0, menor = 0;
        for(int x = 1; x<=25;x++){
            System.out.println("Qual foi o valor da da sua "+x+"ª nota? ");
            nota = sc.nextDouble();
            media += nota;
            if(x == 1){
                maior = menor = nota;
            }
            if(x > 1){
                if(nota > maior){
                    maior = nota;
                }
                else if(nota < menor){
                    menor = nota;
                }
            }
            if(x == 25){
                media = media/x;
            }
        }
        System.out.println("Maior nota: "+maior+"\nMenor nota: "+menor+"\nMédia das notas: "+media);
    }
}
