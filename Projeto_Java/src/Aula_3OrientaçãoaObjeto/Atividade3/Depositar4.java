package Aula_3OrientaçãoaObjeto.Atividade3;
import java.util.ArrayList;
public class Depositar4{
    private double adição;
    private ArrayList lista = new ArrayList();
    public Depositar4(double saldo,double quantia,String nomeTitular,int numConta){
        //this.adição = saldo - quantia;
        this.lista = lista;
        this.lista.add(saldo);
        this.lista.add(nomeTitular);
        this.lista.add(numConta);
    }
    public void depositario(){
        System.out.println("Com o deposito sua conta fica R$ "+this.adição);
        System.out.println("Saldo: "+lista.get(0)+"\nSr(a): "+lista.get(1)+"\nNª conta: "+lista.get(2));
    }
}
