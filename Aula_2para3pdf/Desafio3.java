package Aula_2para3pdf;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Desafio3 {
    public static void main(String[] args) {
        /*Crie um programa para ler 10 n�meros e no final da leitura de
todos os n�meros apresente quantos n�meros lidos foram
maiores que 50.
*/
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        double comparador = 0;
        for(int x= 0; x<=10;x++){
            System.out.println("Digite um n�mero: ");
            numero = sc.nextDouble();
            if(x > 50){
                comparador = numero;
            }
            else{
                if(numero > comparador){
                    comparador = numero;
                }
            }
        }
        System.out.println("O maior n�mero digitado foi de "+comparador);
    }
}
