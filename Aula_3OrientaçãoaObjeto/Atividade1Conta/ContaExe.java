package Aula_3OrientaçãoaObjeto.Atividade1Conta;

public class ContaExe {
    public static void main(String[] args) {
        Conta csaque = new Saque("Carlos",4619,9.650);
        csaque.realizarconta();
        Conta cdep = new Deposito("Alberto",981,8.000);
        cdep.realizarconta();
        Conta csaque2 =  new Saque("Andreia",98,10.001);
        csaque2.realizarconta();
        Conta cdep2 = new Deposito("Marcola",1,1.000000000);
        cdep2.realizarconta();
        }
    }

