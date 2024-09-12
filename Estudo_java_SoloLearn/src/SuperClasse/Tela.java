package SuperClasse;
public class Tela{
    public static void main(String[] args) {
        Livraria objm = new Generos();//posso chamar pela Super classe
        objm.mostrador();
        Generos objmet = new Generos();//posso chamar diretamente pela subclasse
        objmet.mostrador();
    }
}
