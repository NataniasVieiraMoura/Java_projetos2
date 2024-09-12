public class Classe_matemática { /*A classe de matematica*/
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //O JDK tráz um série de classes como a Math por padrão.
        int calculo_produto = Math.abs(10);
        int vendas_atual = Math.abs(-283);
        double porc_fat_mensa = 32.232;
        double fat_mensal_min = Math.ceil(porc_fat_mensa);
        double fat_mensal_max = Math.floor(porc_fat_mensa);
        double[] lista = {calculo_produto, fat_mensal_max,
        fat_mensal_min, porc_fat_mensa,vendas_atual};
        for( double x : lista){
            System.out.println(x);
        }
        for(int l = 0; lista.length <= 3; l++) {
            double maximo = Math.max(lista[l], lista[l + 1]);
            if (l == 3) {
                System.out.println("O maior da lista é :" + maximo);
            }
        }
        double pi = Math.abs(3.141);//define o valor para cálculo
        double pi2 = Math.pow(pi,2);//potência(paramentros:valor,potência)
        double picubo = Math.pow(pi,3);
        double[] pis = {pi,pi2,picubo};
        for(double index : pis){
            System.out.println(index);
        }
        int valor_pjt = Math.min(23,-23);
        int trh = Math.min(-100,4);
        System.out.println(valor_pjt+"\n"+trh);
        //STATIC:
        cont_statico c_s = new cont_statico();
        System.out.println(cont_statico.valor_pag);
        cont_statico.printador("O mundo não é mais o mesmo Logan");
        cont_statico.printador("Me digas o que comes, que eu te direi o que és");
        cont_statico.login("Fernanda Guimarães","168435");


    }
}