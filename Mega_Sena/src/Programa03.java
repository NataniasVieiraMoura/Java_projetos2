
import java.util.Scanner;
public class Programa03 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);//funcionalidade para receber valores
        System.out.print("Qual teu nome criatura?");//texto para perguntar e receber um valor
        String nome = sc.nextLine();//função para receber valores
        System.out.println(nome);//exibe nome
        System.out.println("Qual sua idade "+nome+"?");//adiciona variavel nome ao texto que vai exibir
        int idade = sc.nextInt();//receber numero do tipo inteiro do usuário
        System.out.println("Então você têm "+idade+" anos");//texto mais variavel
        int[] idades = {idade};//array idades recebe variavel idades
        String[] pessoas = {nome};//array pessoas recebe variavel nome
        System.out.println("Nessa lista há "+ idades.length +" idades.\nE pessoas há "+pessoas.length);
        //A função length retorna o número de elementos na lista.
        //Existem tipos primitivos(ocupam certo espaço) e não-primitivos(ocupam menos espaço)
        int x = 100;//Para armazernar valore use tipo primitivos
        double mostrador = 12.432 /0.12;
        float cotação = 234.34f;
        char post = 4;
        Integer y = 299;
        System.out.println(y.toString());
        System.out.println(y.doubleValue());
        System.out.println(y.intValue());
        //ESCOPO DE VARIÁVEIS:
        String global = "variavel_global";
        if(true){
            String local = "variável_local";//Essa variável só existe nesse bloco de código, pois é variavel local
            global += "_novo_valor";/*Variáveis globais podem ser usadas em todo o código*/
        }
        System.out.println(global);
        //System.out.pirntln(local);/*Variavel local não pode ser executada
        //fora do bloco de código que foi declarada. Nesse caso o if*/
        //Variáveis imutáveis ou constantes:
        final double today = 539;
        //a variavel se torna constante com o `final` no inicio.
        //today = 12; => Essa linha dará err porque a variavel não pode ser mais alterada
    }
}
