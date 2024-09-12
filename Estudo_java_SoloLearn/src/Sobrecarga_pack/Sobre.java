package Sobrecarga_pack;

public class Sobre {
    public void padrão(){
        System.out.println("02/05/2022");
        System.out.println("Por favor, não deixe vazio");
    }
    public void padrão(String nome, String data){
        System.out.println(nome);
        System.out.println(data);
    }

    public static void main(String[] args) {
        Sobre objeto = new Sobre();
        objeto.padrão();
        Sobre obj0 = new Sobre();
        obj0.padrão("Mauricio","01/12/99");
    }
}
