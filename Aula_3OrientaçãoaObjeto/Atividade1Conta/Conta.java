package Aula_3Orienta��oaObjeto.Atividade1Conta;
/*1) Implementar uma classe Conta tendo como atributos o nome do titular,
n�mero e saldo e os m�todos sacar e depositar.*/


public abstract class Conta {//super classe Conta
    protected String nomeTitular;//vari�vel protegida
    protected int numConta;
    protected double saldo = 0;
    protected double quantia;
    public Conta(String nomeTitular,int numConta,double quantia){//m�todo construtor
        this.nomeTitular = nomeTitular;//atributos declarados pelo construtor
        this.numConta = numConta;
        this.quantia = quantia;
        this.saldo = saldo;
    }
        public abstract void realizarconta();
}
