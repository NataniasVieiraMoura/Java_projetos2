package Aula_3OrientaçãoaObjeto.Atividade1Conta;

import java.util.Scanner;

public class Deposito extends Conta {//Classe Deposito recebe atributos da classe Conta
    public Deposito(String nomeTitular,int numConta,double quantia){

        super(nomeTitular,numConta,quantia);
    }
    public void realizarconta(){
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        //tem de chamar os atributos da super classe na ordem que estão no construtor
        Scanner sc = new Scanner(System.in);
        this.saldo = saldo;
        this.quantia = 0;
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        /*
        System.out.println("Qual seu nome Sr(a)? ");
        this.nomeTitular = sc.next();
        System.out.println("Qual número da sua conta? ");
        this.numConta = sc.nextInt();
        System.out.println("Quanto deseja depositar? ");
        this.quantia = sc.nextDouble();
        */
        this.saldo += this.quantia;
        System.out.println("Sr(a) "+this.nomeTitular+" você possui R$ "+this.saldo+" em conta.");

    }
}
