package Aula_1pdf;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Vamos_pensar_juntos1 {
    /*Monte uma expressão lógica para verificar se uma pessoa está apta para
realizar a prova da carteira de habilitação para motos. O(A) candidato(a)
precisa ter 18 anos e ter assistido a 45 horas de aula teórica e 20 horas
de aula prática.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Quantas horas práticas você têm? ");
        int horasp = sc.nextInt();
        System.out.println("Quantas horas teoricas você têm? ");
        int horast = sc.nextInt();
        if(idade >= 18 && horast >= 45 && horasp >= 20){
            System.out.println("Você está  apto para fazer a prova de habilitação");
        }
        else{
            System.out.println("Você não cumpre um dos requisitos para realizar a prova");
            if(idade < 18){
                System.out.println("Sua idade é inferior a 18. Não pode fazer a prova.");
            }
            if(horast < 45 || horasp < 20){
                System.out.println("Você não tem horas assistidas necessárias");
            }
        }
    }
}
