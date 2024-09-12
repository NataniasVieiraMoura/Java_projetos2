package Aula_2para3pdf;
import java.util.Scanner;
public class Desafio11 {
    public static void main(String[] args) {
        /*Imagine que você foi contratado para desenvolver um sistema para um caixa eletrônico
de dinheiro. Esse caixa só serve para sacar dinheiro e só funciona para 10 clientes por
dia. Ao final de um dia, o sistema deve emitir um relatório apresentando: qual foi o
maior valor de dinheiro sacado, qual a média do dinheiro sacado e qual foi o total de
dinheiro sacado por todos os clientes naquele dia. A saída deverá ser da seguinte forma:
****** Bem-vindo ao Caixa eletrônico ******
Qual valor deseja sacar: 50
****** Bem-vindo ao Caixa eletrônico ******
Qual valor deseja sacar: 30
****** Bem-vindo ao Caixa eletrônico ******
Qual valor deseja sacar: 20
.........
Relatório do dia
Maior valor sacado: 50.0
Média do valor sacado: 33.33
Total de valor sacado: 100.0
*/      Scanner sc = new Scanner(System.in);
        double saque = 0;
        double tot = 0;
        double menor = 0;
        double maior = 0;
        for(int x = 1; x<=10;x++){
            System.out.println("*************Banco do Brasil**************");
            System.out.println("Quanto você deseja sacar? ");
            saque = sc.nextDouble();
            tot += saque;
            if(x == 1){
                maior = menor = saque;
            }
            else{
                if(maior < saque){
                    maior = saque;
                }
                else if(menor > saque){
                    menor = saque;
                }
            }
        }
        System.out.println("...........");
        System.out.println("Relatório do dia:\nMaior: "+maior+"\nMenor: "+menor+"\nSaque total do dia: "+tot);
    }
}
