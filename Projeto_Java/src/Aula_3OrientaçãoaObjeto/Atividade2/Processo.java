package Aula_3Orienta��oaObjeto.Atividade2;
import java.util.Scanner;

public class Processo extends Conta {//Classe Deposito recebe atributos da classe Conta
    public Processo(String nomeTitular,int numConta,double quantia){
        super(nomeTitular,numConta,quantia);
    }
    private int op��o;//atributo de escolha
    private boolean porta = false;
    public void realizarconta() {
        this.saldo = saldo;
        this.quantia = quantia;
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.op��o = op��o;
        this.porta = false;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Escolha uma op��o:\nDepositar(1)\nSacar(2)\nSair(qualquer coisa)\n:");
            op��o = sc.nextInt();
            System.out.println("Qual seu nome Sr(a)? ");
            this.nomeTitular = sc.next();
            System.out.println("Qual n�mero da sua conta? ");
            this.numConta = sc.nextInt();
            if(op��o == 1) {
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            //tem de chamar os atributos da super classe na ordem que est�o no construtor
                System.out.println("Quanto deseja depositar? ");
                this.quantia = sc.nextDouble();
                this.saldo += this.quantia;
                System.out.println("Sr(a) " + this.nomeTitular + " voc� possui R$ " + this.saldo + " em conta.");
            }
            else if (op��o == 2) {
                System.out.println("||||||||||||||||||||||||||||||||||||||");
                System.out.println("Quanto deseja sacar? ");
                this.quantia = sc.nextDouble();
                if (this.quantia > this.saldo) {
                    porta = true;
                    System.out.println("Sr(a) " + this.nomeTitular + " voc� n�o pode sacar mais do que possui:\n" + this.saldo);
                }
                else {
                    this.saldo -= this.quantia;
                    System.out.println("Sr(a) " + this.nomeTitular + " voc� sacou R$ " + this.saldo + "\nVoc� possui atualmente R$ " + this.quantia + " em caixa.");
                }
            }
            else{
                break;
            }
        }
    }
}
