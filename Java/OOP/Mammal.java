package Java.OOP;


public abstract class Mammal {
    private int limbs = 4;
    private String birth = "whole";

    public void liveBirth() {
        System.out.println(birth);
    }

    abstract void makeSound();
}
