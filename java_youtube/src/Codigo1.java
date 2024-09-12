public class Codigo1 {
    static int planilha =  100;/*=>padrão default: Classes do mesmo escopo tem
    acesso a essa variavel*/
    public static String tabela = "Auto-peças";//visibilidade publica: para todos os pacotes
    private String usuário = "Galeno Tarso Moreira";/*Somente a classe atual pode acessar
    essa variável. Ou seja, a variável é restrita para a classe Codigo1*/
    protected static String buscador = "Tartanos"; //==>POO;
    public static void main(String []args){
        System.out.println(planilha);
    }
    static String menu(){
        return "Fatura\nBoleto\nCheque-especialz\nEstrato;";
    }
}
