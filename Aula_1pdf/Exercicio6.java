package Aula_1pdf;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        /*5) Monte uma express�o l�gica para verificar se um cliente est�
apto para receber um desconto em uma loja. O cliente precisa ter
feito pelo menos 5 compras nos �ltimos 3 meses e o valor total
das compras deve ser superior a R$ 500,00.*/
        int compras = 0;
        int meses = 0;
        double valortot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas compras voc� fez?");
        compras = sc.nextInt();
        System.out.println("Nos �ltimos quantos meses? ");
        meses = sc.nextInt();
        System.out.println("Quanto voc� nessas compras desse per�odo? ");
        valortot = sc.nextDouble();
        if(compras >= 5 && meses == 3 && valortot >=  500){
            System.out.println("Voc� receber� desconto de 50% das ");
        }
        else{

        }
    }
}
