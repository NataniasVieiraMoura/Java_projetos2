package Aula_3Orienta��oaObjeto.Atividade3;
import java.util.ArrayList;
public class Depositar4{
    private double adi��o;
    private ArrayList lista = new ArrayList();
    public Depositar4(double saldo,double quantia,String nomeTitular,int numConta){
        //this.adi��o = saldo - quantia;
        this.lista = lista;
        this.lista.add(saldo);
        this.lista.add(nomeTitular);
        this.lista.add(numConta);
    }
    public void depositario(){
        System.out.println("Com o deposito sua conta fica R$ "+this.adi��o);
        System.out.println("Saldo: "+lista.get(0)+"\nSr(a): "+lista.get(1)+"\nN� conta: "+lista.get(2));
    }
}
