public class Programa05ª{
    //para alementar o tamanho da letra: ctrl + dedos em forma de pinça no mouse do notbook (ou scroll no mouse externo)
    public static void main(String []args){
        /*Public é um modificador de acesso: é usado para definir o nível de acesso:
        * Pode ser usado para modificadores de acesso, para classes, atributos e métodos.
        * Para classes : public =>A classe é acessível por qualquer outra classe.
        * Para classes : deafalt =>A classe é acessível apenas por classes no mesmo pacote.
        * Para atributos e métodos:
        * defalt: uma variável ou método declarado sem modificador de controle de acesso
        * está disponível para qualquer outra classe no mesmo pacote;
        * public: Acessível por qualquer outra classe.
        * protected: fornece o mesmo acesso que o modificador de acesso defalt, com o acré-
        * cimo de que subclasses podem acessar métodos e variáveis protegidos da superclasse
        * private:Acessível apenas dentro da propia classe declarada.*/

    }
    //Praticando:
    private int vel_maxima;
    protected String tomada_ar;
    private String fora_do_ar;
    private int litros;
    private String color;
    private double capac_combustivel;
    public void carro(){
        System.out.println("Fumm-Fumm!!");
    }
}
