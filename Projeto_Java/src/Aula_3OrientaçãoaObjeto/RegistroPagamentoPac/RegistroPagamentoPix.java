package Aula_3OrientaçãoaObjeto.RegistroPagamentoPac;
import java.util.Date;
public class RegistroPagamentoPix extends RegistroPagamanto {
    public RegistroPagamentoPix( double valor, Date dataVencimento, double
            percentualDesconto ) {
        super(valor, dataVencimento);
        this.percentualDesconto = percentualDesconto ;
    }
    private double percentualDesconto ;
    @Override
    public void realizarPagamento() {
        this.valor = this.valor - ((this.valor * this.percentualDesconto ) /
                100);
        this.pago = true;
        System.out.println("O valor pago foi de " + this.valor);
    }
}
