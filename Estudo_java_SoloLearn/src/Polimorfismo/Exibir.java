package Polimorfismo;

public class Exibir {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();//som de cachorro
        cat.makeSound();//som de gato
        Animal fera = new Animal();
        fera.makeSound();

/*
Regras para Substituição de Método:
- Deve ter o mesmo tipo de retorno e argumentos
- O nível de acesso não pode ser mais restritivo do que o nível de
acesso do método substituído (Exemplo: Se o método da superclasse é
declarado como público, o método de substituição na subclasse não pode
ser nem privado nem protegido)
- Um método declarado como final ou static não pode ser substituído
- Se um método não pode ser herdado, ele não pode ser substituído
- Construtores não podem ser substituídos
*/

    }
}
