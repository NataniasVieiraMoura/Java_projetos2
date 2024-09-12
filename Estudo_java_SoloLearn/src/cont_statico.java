public class cont_statico{
    public static int valor_pag =0;
    /*Essa é uma variável estática que pode ser acessada por qualquer objeto de outra classe*/
        cont_statico() {
            valor_pag++;
        }
    static void printador(String txt){
            System.out.println(txt);
    }
    int preço = 0;
       public int getPreço(){//aqui não têm void por que têm return
           return preço;
       }
       public void setPreço(int valor) {//aqui é void porque não têm return
           this.preço = valor;
       }
       public static void login(String nome,String senha){
           System.out.println("Nome feio esse tal de :"+nome+"\n .Sem falar dessa senha escrota aqui");
       }
}
