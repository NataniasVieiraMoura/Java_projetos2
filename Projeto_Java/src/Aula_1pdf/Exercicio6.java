package Aula_1pdf;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        /*5) Monte uma expressão lógica para verificar se um cliente está
apto para receber um desconto em uma loja. O cliente precisa ter
feito pelo menos 5 compras nos últimos 3 meses e o valor total
das compras deve ser superior a R$ 500,00.*/
        int compras = 0;
        int meses = 0;
        double valortot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas compras você fez?");
        compras = sc.nextInt();
        System.out.println("Nos últimos quantos meses? ");
        meses = sc.nextInt();
        System.out.println("Quanto você nessas compras desse período? ");
        valortot = sc.nextDouble();
        if(compras >= 5 && meses == 3 && valortot >=  500){
            System.out.println("Você receberá desconto de 50% das ");
        }
        else{

        }
    }
}
