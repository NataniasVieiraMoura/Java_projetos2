package Aula_3OrientaçãoaObjeto.RegistroPagamentoPac;
import java.util.Date;
public abstract class RegistroPagamanto {
        protected double valor;
        protected Date dataVencimento;
        protected boolean pago;
        public RegistroPagamanto(double valor, Date dataVencimento) {
            this.valor = valor;
            this.dataVencimento = dataVencimento;
            this.pago = false;
        }
        public abstract void realizarPagamento();
    }

