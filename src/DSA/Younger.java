package DSA;

class Animal {
    void eee() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eir() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Younger {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eee();
        d.eir();

        c.eee();
        c.meow();
    }
}
