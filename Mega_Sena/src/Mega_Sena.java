import java.util.Scanner;
import java.util.Random;
public class Mega_Sena{//nome da classe criada

    public static void main(String[] args){
        Random generate = new Random();//gerador de numeros aleatórios
        int ponteiro = 0;
        while(ponteiro <= 5) {
            int sorteado = generate.nextInt(60);//bound é o limite, no caso o número pode ser de 1 a 60
            System.out.println("E o " + ponteiro + "ª número escolhido foi: " + sorteado);
            ponteiro += 1;
        }
        /*
        ponteiro = 1;
        int acertou = 0;
            Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite seu " + ponteiro + "ª nùmero:");
            int perg = sc.nextInt();
            ponteiro++;
        }while(ponteiro <= 6);
         */
        for(int tus = 1; tus <= 6;tus++){
            System.out.println(tus+"ª");
            for(int sed = 1; sed <= tus; sed++) {
                System.out.print(sed + "ª");
            }
            if(tus == 6){
                System.out.print(tus+1+"ª");
            }
        }
        /*Para chamar os comanados da class Programa01 na pasta src:*/
        //Abaixo temos respectivamente:
        //Tipo nome_da_variavel = new tipo()
        Programa01 programa01 = new Programa01();
    }
}