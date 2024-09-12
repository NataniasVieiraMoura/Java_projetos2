package Aula_3OrientaçãoaObjeto.Atividade1Conta;
/*1) Implementar uma classe Conta tendo como atributos o nome do titular,
número e saldo e os métodos sacar e depositar.*/


public abstract class Conta {//super classe Conta
    protected String nomeTitular;//variável protegida
    protected int numConta;
    protected double saldo = 0;
    protected double quantia;
    public Conta(String nomeTitular,int numConta,double quantia){//método construtor
        this.nomeTitular = nomeTitular;//atributos declarados pelo construtor
        this.numConta = numConta;
        this.quantia = quantia;
        this.saldo = saldo;
    }
        public abstract void realizarconta();
}
