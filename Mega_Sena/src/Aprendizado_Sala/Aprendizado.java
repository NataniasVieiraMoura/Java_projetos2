package Aprendizado_Sala;
import java.util.ArrayList;
public class Aprendizado {
    public static void main(String[] args) {
        ArrayList<String> lStrings = new ArrayList<>();
        ArrayList<Double> lDouble = new ArrayList<>();
        for(int x  = 0;x<=10;x++){
            lStrings.add("Elemento A"+x);
            System.out.println(lStrings.get(x));
        }
        System.out.println(lStrings.remove(3));//remove um elemento no indice dado
        System.out.println(lStrings.isEmpty());//verifica se a lista está vazia
        System.out.println(lStrings.size());//verifica o tamanho da lista
        System.out.println(lStrings);

    }
}
