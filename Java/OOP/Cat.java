package Java.OOP;

import Java.OOP.Mammal;

public class Cat extends Mammal {

    public void makeSound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Cat pepper = new Cat();
        pepper.makeSound();
        pepper.liveBirth();
    }
}
