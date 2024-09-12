public class Vehicle {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;
    void horn() {
        System.out.println("Beep!!");

        /*Public é um modificador de acesso: é usado para definir o nível de acesso.
         * Pode ser usado para modificadores de acesso para classes, atributos e métodos.
         * Para classes :
         * public =>A classe é acessível por qualquer outra classe.
         * deafalt =>A classe é acessível apenas por classes no mesmo pacote.
         * Para atributos e métodos:
         * defalt => uma variável ou método declarado sem modificador de controle de acesso
         * está disponível para qualquer outra classe no mesmo pacote;
         * public => Acessível por qualquer outra classe.
         * protected => fornece o mesmo acesso que o modificador de acesso defalt, com o acré-
         * cimo de que subclasses podem acessar métodos e variáveis protegidos da superclasse
         * private => Acessível apenas dentro da propia classe declarada.*/
            System.out.println("Fumm-Fumm!!");
    }
    //Praticando:
    private int vel_maxima;
    private int litros;
    private double capac_combustivel;

    /*Aulas do SoloLearn : Geeter e Setters*/
    private String pintar = "Cantora";//cria uma variavel exclusiva da class Vehicle
    public String getPintar(){//Pode receber parametros ou não para ativar o evento de retorno
        //Getter
        /*Server para exibir uma variável em outra class*/
        /*Aqui você pode criar parametros para que a variável possar se usada*/
        return pintar;//retorna a variável
    }
    //Setter
    public void setPintar(String p){/*Recebe parametros necessários para
    alteração do conteúdo da variável ou não.*/
        this.pintar = p;
    }
    public static void main(String []args){
        Vehicle v1 = new Vehicle();
        v1.setPintar("Black");//parametro de entrada set
        System.out.println(v1.getPintar());//saida com get
    }
    //Construtores:
    /*Tipo de métodos que irão configurar sua classe por padrão, logo
    * tu não precisas repetir o mesmo código todas as vezes.*/
    private float prototipo;
    /*O construtor sempre têm o nome da sua class
    * recebe parametros que podem sem alterados em outra class*/
    Vehicle(){//Método Vehicle é o construtor
        prototipo = 2343f;
    }
    private String constr;//atributo criado
    Vehicle(String t){
        constr = t;
    }//pode editar o valor de constr por outra class(no caso MyClass)

}

