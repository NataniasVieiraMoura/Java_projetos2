package Aula_3OrientaçãoaObjeto.Atividade3;
import java.util.ArrayList;
import java.util.Scanner;
public class CriarConta1 extends Conta {
    public CriarConta1(String nomeTitular, int numConta, double quantia) {
        super(nomeTitular, numConta, quantia);
    }
    private int escolha;
    public void atuador() {
        ArrayList lista = new ArrayList();
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldo;
        this.escolha = escolha;
        Scanner sc = new Scanner(System.in);
        this.saldo = 1000;
        System.out.println("Quantia padrão R$ "+this.saldo);
        while (true) {
            System.out.println("Escolha emtre 1 e 4: ");
            this.escolha = sc.nextInt();
            //System.out.println(escolha);
            if (this.escolha <= 4 && this.escolha >= 1) {
                //System.out.println(escolha);
                System.out.println("Insira seu nome: ");
                this.nomeTitular = sc.next();
                System.out.println("Insira seu código: ");
                this.numConta = sc.nextInt();
                System.out.println("Insira a quantia da sua conta");
                this.quantia = sc.nextDouble();
                if (this.escolha == 1) {
                    lista.add(this.nomeTitular);
                    lista.add(this.numConta);
                    this.saldo += this.quantia;
                    lista.add(this.saldo);
                    System.out.println(lista.get(0) + "\n" + lista.get(1) + "\n" + lista.get(2));
                }
                if (this.escolha == 2) {
                    //System.out.println("Aqui 2");
                    this.saldo = this.quantia;
                    if (this.saldo > 0) {
                        //System.out.println("Saldo: " + lista.get(1));
                        VerSaldo2 vs = new VerSaldo2(this.saldo,this.quantia,this.nomeTitular,this.numConta);
                        vs.apresentar();
                    } else {
                        System.out.println("não");
                    }
                } else if (this.escolha == 3) {
                    //System.out.println(escolha);
                    Sacar3 saque = new Sacar3(this.saldo,this.quantia,this.nomeTitular,this.numConta);
                    saque.removedor();
                } else if (this.escolha == 4) {
                    Depositar4 dep = new Depositar4(this.saldo,this.quantia,this.nomeTitular,this.numConta);
                    dep.depositario();
                }
            }
            else {
                break;
            }
        }
    }
}
        /*System.out.println("Insira seu nome: ");
        this.nomeTitular = sc.next();
        System.out.println("Insira seu código: ");
        this.numConta = sc.nextInt();
        System.out.println("Insira a quantia da sua conta");
        this.quantia = sc.nextDouble();
        lista.add(this.nomeTitular);
        lista.add(this.numConta);
        lista.add(this.saldo);
        System.out.println(lista.get(0)+"\n"+lista.get(1)+"\n"+lista.get(2));
         */
