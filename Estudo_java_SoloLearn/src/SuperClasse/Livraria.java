package SuperClasse;

abstract class Livraria {//super classe
    int legs = 0;//variável

    abstract void mostrador();//método da super classe
}

class Generos extends Livraria{//classe Generos herda Livraria
    public void mostrador() {//mostrador é sobrecarregado pela subclasse
        System.out.println("Você está obsevando a execução do método");
    }
}


