public class Calculadora {

    //cd C:\Users\CLIENTE\IdeaProjects\Calculadora\src ==>caminho do diretorio
    //cd(change directory)
    //Coloque no CMD o diretorio correto para abrir o arquivo parceiro
    //javac Calculadora.java
    //javac(java complilator)
    //java Calculadora multiplicar 20 2
    //40
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);//para comverter os args de string para inteiro
        int y = Integer.parseInt(args[2]);//aqui você executa as funções

        if (args[0].equals("somar")) {//verifica se o index têm o valor soma
            sum(x, y);//retorna uma função somar com os argumentos digitados x e y
        }
        else if (args[0].equals("subtrair")) {
            minus(x, y);
        }
        else if(args[0].equals("multiplicar")){
            multiplicar(x,y);
        }
        else if(args[0].equals("dividir")){
            dividir(x,y);
        }
        else if(args[0].equals("resto")){
            resto_div(x,y);
        }
        else {
            System.out.println("Ocorreu algunm erro");
        }
    }
        static void sum ( int x, int y){//aqui você cria a função que vai ser exibida no bloco principal
            System.out.println(x + y);//retorna uma mensagem numa nova linha(println)
        }
        static void minus (int x, int y){
            System.out.println(x - y);
        }
        static void dividir(int x, int y){
            System.out.println(x/y);
        }
        static void multiplicar(int x, int y){
        System.out.println(x * y);
        }
        static void resto_div(int x, int y){ System.out.println(x%y);}
}