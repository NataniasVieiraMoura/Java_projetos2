package Aula_2para3pdf;
import java.util.Scanner;
public class Desafio8 {
    public static void main(String[] args) {
        /*Imagine que voc� foi contratado para desenvolver um sistema para uma academia. Para cada
aluno novo da academia, o sistema deve solicitar o seu nome e gerar automaticamente uma nova
matr�cula. A matr�cula deve constar inicialmente dos dois �ltimos d�gitos do ano do cadastro
(exemplos: 24 quando for cadastrado no ano 2024) e, em seguida, um n�mero sequencial.
Imagine que o sistema vai funcionar apenas para 15 novas matr�culas. Como voc� poderia gerar
essas matr�culas de forma autom�tica? Exemplo de matr�culas em 2024: a primeira matr�cula seria
2401, 2402, 2403, at� 2415. A sa�da dever� ser da seguinte forma:
Digite o nome da(o) cliente: Renato
A matr�cula da(o) Renato � 2101
Digite o nome da(o) cliente: Maria
A matr�cula da(o) Maria � 2102
Digite o nome da(o) cliente: Paula
A matr�cula da(o) Paula � 2103
....
Digite o nome da(o) cliente: Priscila
A matr�cula da(o) Priscila � 2115*/

        int matricula = 0;
        int ano = 2400;
        String nome = "";
        Scanner sc = new Scanner(System.in);
        for(int y = 100; true;y++){
            for(int x = 1;x <= 15; x++){
                System.out.println("Qual seu nome Sr(a): ");
                nome = sc.next();
                matricula = ano + x;
                System.out.println("Sr(a) "+nome+" sua matr�cula ser� : "+matricula);
            }
            ano += 100;
            System.out.println("Deseja sair(sim/n�o)? ");
            String sair = sc.next();
            if(sair.equals("sim")){
                break;
            }
        }
    }
}
