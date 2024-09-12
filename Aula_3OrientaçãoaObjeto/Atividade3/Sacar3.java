package Aula_3OrientaçãoaObjeto.Atividade3;
import java.util.ArrayList;
public class Sacar3{
    private double remove;
    private ArrayList lista = new ArrayList();
    public Sacar3(double saldo,double quantia,String nomeTitular,int numConta){
        //this.remove = saldo - quantia;
        this.lista = lista;
        this.lista.add(saldo);
        this.lista.add(nomeTitular);
        this.lista.add(numConta);
    }
    public void removedor(){
        System.out.println("O saldo da sua conta pelo saque foi de R$ "+this.remove);
        System.out.println("Saldo: "+lista.get(0)+"\nSr(a): "+lista.get(1)+"\nNª conta: "+lista.get(2));
    }
}
