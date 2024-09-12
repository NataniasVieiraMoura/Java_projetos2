package Aula_3OrientaçãoaObjeto.RegistroPagamentoPac;
import java.util.Date;
public class RegistroPagamentoCredito extends RegistroPagamanto {
    private double percentualJuros ;
    public RegistroPagamentoCredito( double valor, Date dataVencimento , double
            percentualJuros ) {
        super(valor,dataVencimento);
        this.percentualJuros = percentualJuros ;
    }
    @Override
    public void realizarPagamento() {
        this.valor = this.valor + ((this.valor * percentualJuros )/100);
        this.pago = true;
        System.out.println("O valor pago foi de " + this.valor);
    }
}
