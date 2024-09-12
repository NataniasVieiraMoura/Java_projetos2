public class Programa04 {//Classe chamada Programa04
    public static void main(String[] args) {
        //main => metodo utilizado
        //Esse bloco com void significa que o bloco não retorna valor.
        int[] idades;//lista de tipo inteiro chamada idades
        double[] dinheiro;//lista tipo decimal chamada dinheiro
        float[] peso;//lista tipo decimal chamada peso
        boolean[] lista_compras;//lista de tipo binário ou booleano chamada lista_comapras
        idades = new int[10];//número de espaços para a lista 10
        dinheiro = new double[6];//número de espaços para a lista 6
        peso = new float[7];//número de espaçõs para a lista 7
        lista_compras = new boolean[20];//número de espaços para a lista 20
        //função length conta a quantidade de espaços no array(lista)
        //\n é um elemento que solta uma linha
        System.out.println(idades.length + "\n" + dinheiro.length + "\n" +
                peso.length + "\n" + lista_compras.length);
        idades[4] = 23;//index 4 recebe 23
        dinheiro[2] = 23.342;//index2 recebe 23.342
        peso[4] = 42.34f;//número tipo float termina por f =>42.34f
        lista_compras[11] = false;//index 11 recebe false
        int[] verão = {3, 23, 54, 98, 23, 54, 2};
        /*para inserir valores no array faça a lista receber chaeves
         * e vá adicionando elementos*/
        System.out.println("Loop normal:");
        //Abaixo loop da lista verão:
        for (int x = 0; x < verão.length; x++) {
            //(^para_variavel;^enquanto_condição;^ação_a_realizar)
            System.out.println(verão[x]);
        }
        System.out.println("Loop para cada elemento na lista:");
        //Loop for-aech:(loop para-cada)<==usado para arrays
        for (int y : verão) {
            System.out.println(y);
        }
        //Abaixo arrays Multidimensionais:
        int[][] notas = {{2, 56, 9}/*<==Essa chave é linha e cada número é coluna*/, {15, 98, 35}};
        System.out.println("Lista notas[0][2] = " + notas[0][2]);//notas[index_da_linha][index_da_coluna]

        //Abaixo Métodos(funções):

        System.out.println(texto("marcos ALBERTO CARDOSO sOARES", false));
        /*Acima: método texto com parametros palavra quer recebe String e maius que recebe boolean*/
        bem_vindos();
        //Pode-se atribuir métodos(funções) a variáveis:
        String atribuido = texto("CArloS",true);
        System.out.println(atribuido);
    }
    static String texto(String palavra,boolean maius){//Esse método é o texto()
        //String para texto => ou seja, retorna String
        //note: foi usado String no lugar de void para poder retornar valor.
        //Os parametros são maius que recebe true ou false e a String palavra
        if(maius == true){//condição
            palavra = palavra.toUpperCase();
        }
        else{//caso não satisfeita a condição
            palavra = palavra.toLowerCase();
        }
        return palavra;
    }
    static void bem_vindos(){//void => não há valores de retorno
        System.out.println("Olá, tudo bem com você?");
        System.out.println("Olá mundo.");
        System.out.println("Welecome.");
        System.out.println("I am a method");
    }

}
