package Aula_2para3pdf;
import java.util.Scanner;
public class Desafio8 {
    public static void main(String[] args) {
        /*Imagine que você foi contratado para desenvolver um sistema para uma academia. Para cada
aluno novo da academia, o sistema deve solicitar o seu nome e gerar automaticamente uma nova
matrícula. A matrícula deve constar inicialmente dos dois últimos dígitos do ano do cadastro
(exemplos: 24 quando for cadastrado no ano 2024) e, em seguida, um número sequencial.
Imagine que o sistema vai funcionar apenas para 15 novas matrículas. Como você poderia gerar
essas matrículas de forma automática? Exemplo de matrículas em 2024: a primeira matrícula seria
2401, 2402, 2403, até 2415. A saída deverá ser da seguinte forma:
Digite o nome da(o) cliente: Renato
A matrícula da(o) Renato é 2101
Digite o nome da(o) cliente: Maria
A matrícula da(o) Maria é 2102
Digite o nome da(o) cliente: Paula
A matrícula da(o) Paula é 2103
....
Digite o nome da(o) cliente: Priscila
A matrícula da(o) Priscila é 2115*/

        int matricula = 0;
        int ano = 2400;
        String nome = "";
        Scanner sc = new Scanner(System.in);
        for(int y = 100; true;y++){
            for(int x = 1;x <= 15; x++){
                System.out.println("Qual seu nome Sr(a): ");
                nome = sc.next();
                matricula = ano + x;
                System.out.println("Sr(a) "+nome+" sua matrícula será : "+matricula);
            }
            ano += 100;
            System.out.println("Deseja sair(sim/não)? ");
            String sair = sc.next();
            if(sair.equals("sim")){
                break;
            }
        }
    }
}
