package Aula_3OrientaçãoaObjeto.Atividade3;
import java.util.ArrayList;
public class VerSaldo2{
    private ArrayList lista = new ArrayList();
    private double mostra;
    public VerSaldo2(double saldo,double quantia,String nomeTitular,int numConta){
        //this.mostra = saldo;
        this.lista = lista;
        this.lista.add(saldo);
        this.lista.add(nomeTitular);
        this.lista.add(numConta);

    }
    public void apresentar(){

        System.out.println("Seu saldo é de R$ "+lista.get(0));
        System.out.println("Saldo: "+lista.get(0)+"\nSr(a): "+lista.get(1)+"\nNª conta: "+lista.get(2));
    }
}

