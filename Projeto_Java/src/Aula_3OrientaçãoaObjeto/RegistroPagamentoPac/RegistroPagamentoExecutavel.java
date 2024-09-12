package Aula_3OrientaçãoaObjeto.RegistroPagamentoPac;
import java.util.Date;
public class RegistroPagamentoExecutavel {
    public static void main(String[] args) {
        RegistroPagamanto r1 = new RegistroPagamentoCredito(100, new
                Date(), 10);
        r1.realizarPagamento();
        System.err.println("--------------------------------------");
        RegistroPagamanto r2 = new RegistroPagamentoPix(100, new Date(),10);
        r2.realizarPagamento();
    }
}
