package Polimorfismo;

/*Polimorfismo, que se refere à ideia de "ter muitas formas",
    ocorre quando existe uma hierarquia de classes relacionadas entre
    si através da herança.
    Uma chamada a um método membro fará com que uma
    implementação diferente seja executada, dependendo do tipo do
    objeto que invoca o método.
    Aqui está um exemplo: Cão e Gato são classes que herdam da
    classe Animal. Cada classe tem sua própria implementação do método makeSound().
    */
public class Animal {//Se torna a Classe principal
    public void makeSound() {//O mesmo método
        System.out.println("Grr...");
    }
}


