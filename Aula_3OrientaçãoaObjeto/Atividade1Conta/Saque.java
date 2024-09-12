package Aula_3OrientaçãoaObjeto.Atividade1Conta;

import java.util.Scanner;
public class Saque extends Conta{
    public Saque(String nomeTitular,int numConta,double quantia){
        super(nomeTitular,numConta,quantia);
        //tem que chamar os atributos do contrutor do superclasse na ordem do construtor
        }
    public void realizarconta(){
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        //o atributo this.saldo pode ser manipulado sem ser declarado no super
        Scanner sc = new Scanner(System.in);
        this.quantia = 0;
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        /*
        System.out.println("Qual seu nome Sr(a)? ");
        this.nomeTitular = sc.next();
        System.out.println("Qual número da sua conta? ");
        this.numConta = sc.nextInt();
        System.out.println("Quanto deseja sacar? ");
        this.quantia = sc.nextDouble();
         */
        if (this.quantia > this.saldo) {
            System.out.println("Sr(a) " + this.nomeTitular + " você não pode sacar mais do que possui:\n" + this.saldo);
        } else {
            this.saldo -= this.quantia;
            System.out.println("Sr(a) "+this.nomeTitular+" você sacou R$ " + this.saldo + "\nVocê possui atualmente R$ " + this.quantia + " em caixa.");
        }
}
}

