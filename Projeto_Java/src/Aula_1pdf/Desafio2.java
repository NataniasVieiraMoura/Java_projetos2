package Aula_1pdf;
import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println("Quando voc� nasceu?");
        int tempo = sc.nextInt();
        System.out.println("Qual a sua cidade natal?");
        String cid = sc.next();
        System.out.println("Ol� Sr(a) "+nome+". Voc� nasceu no ano de "+tempo+". Voc� � da cidade de "+cid);
    }
}
