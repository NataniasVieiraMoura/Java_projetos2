public class Codigo00 {
    private String ação;//cria variável privada

    Codigo00(){
        this.setAção("atributo");
    }
    Codigo00(String k){
        this.setAção(k);
    }
    public void setAção(String k){
        this.ação = k;
    }
    //Tipos de valor e referência:
    /*Tipo de valor: byte, int,
    short,int, long, float, double, boolean e char.*/
    public static void main(String []args){
        int x = 10;
        addOneTo(x);
        System.out.println(x);

        int prit = 4;
        square(prit);
        System.out.println(prit);

        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }
    static void change(Person p){
        p.setAge(10);
    }
    static void square(int prit){
        /*O método square usa a variável como parametro, mas a variável
        * prit do método é local enquanto  a variável do prit da class é global*/
        prit = prit*prit;
    }
    static void addOneTo(int num){
        num = num + 1;
    }
}
