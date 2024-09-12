package Sobrecarga_pack;

public class NumMax {
    /*Sobrecarga de método: O método max é sobre carregado de tipos de variáveis
    *Veja: Um método sobrecarregado deve ter uma lista de argumentos diferente;
    *os parâmetros devem diferir em seu tipo, número, ou ambos.*/
    static int max(int a, int b) {
            if(a > b) {
                return a;
            }
            else {
                return b;
            }
    }
    static double max(double a , double b){//vária o tipo de retono e entrada
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    //O método abaixo max está sobrecarregado de tipo, quantidade e tipo de retorno
    static String max(String text1,String text2, String text3,int casa) {
        if (text1.equals(text2) && text2.equals(text3)) {
            return "Tudo igual";
        } else {
            text2="Tudo diferente";
            return text2;
        }

    }
    public static void main(String[] args) {
        System.out.println(max(8,62));
        System.out.println(max(48.65,87.774));
        System.out.println(max(0.49,0.95));
        System.out.println(max(735,956));
        System.out.println(max("divórcio","Aluguel","pensão",158));
        System.out.println(max("furto","furto","furto", 000));

    }
}

