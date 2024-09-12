package Aula_3OrientaçãoaObjeto.Atividade3;

import java.util.ArrayList;

public abstract class Conta{
    protected String nomeTitular;
    protected int numConta;
    protected double saldo = 0;
    protected double quantia;

    public Conta(String nomeTitular,int numConta,double quantia){//método construtor
        this.nomeTitular = nomeTitular;//atributos declarados pelo construtor
        this.numConta = numConta;
        this.quantia = quantia;
        this.saldo = saldo;
    }

    public abstract void atuador();
}
