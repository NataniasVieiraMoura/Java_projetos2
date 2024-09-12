package Aula_2para3pdf;

public class Desafio6 {
    public static void main(String[] args) {
        /* Exemplo: Agora, modifique seu programa para calcular a
tabuada de multiplicação do número 3 em forma decrescente
para que a saída seja da seguinte forma:
3 x 10 = 30
3 x 9 = 27
3 x 8 = 24
…
3 x 1 = 3*/
        for(int x = 10; x >= 0; x--){
            System.out.println("3 x "+x+" = "+3*x);
        }
    }
}
