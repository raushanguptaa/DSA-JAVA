package opps.polymorphism;

public class MethodOverridingDemo {

    /*
    Question:
    Create Animal class with:

    makeSound()

    Create:

    Dog
    Cat

    Override makeSound() in both classes.

    Output:

    Dog barks
    Cat meows
    */

    static class Animal {

        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {

        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {

        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
    }

