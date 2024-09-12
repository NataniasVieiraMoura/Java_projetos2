package Aula_1pdf;
import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println("Quando você nasceu?");
        int tempo = sc.nextInt();
        System.out.println("Qual a sua cidade natal?");
        String cid = sc.next();
        System.out.println("Olá Sr(a) "+nome+". Você nasceu no ano de "+tempo+". Você é da cidade de "+cid);
    }
}
