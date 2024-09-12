public class MyClass {
        /*Entenda: outra classes(Vehicle, Animal e Codigo00)
        e seus atributos/métodos foram chamados nessa class
        com ,outro nome(no caso de um atributo), para ser manipulado.
         */
        public static void main(String []args) {
            /*Na linha de baixo(8) um nome é designado para a class Animal
            * e com ela você pode chamar um método ou um atributo da class Animal*/
            Animal dog = new Animal();//dog é objeto do tipo Animal
            dog.bark();//bark é o metodo da class Animal
            Vehicle v1 = new Vehicle();//nomeia a class Vehicle para objeto v1
            Vehicle v2 = new Vehicle();//nomeia a class Vehicle para objeto v2
            v1.color = "red";//manipula a variável color da class Vehicle
            /*Na linha 15: nomeada a class Vehicle para v2 que chama o método  horn()
            * esse sem parâmetros.*/
            v2.horn();//chama o método horn() da class Vehicle
            //Construtores
            Vehicle v = new Vehicle("Blue, azul.");/*Isso chama o
            construtor que definirá o atributo constr para azul.*/
            Codigo00 cd0 = new Codigo00();//aqui cd0 será atributo
            Codigo00 cd1 = new Codigo00("Novo_atributo");//aqui cd1 será novo atributo

        }
}

