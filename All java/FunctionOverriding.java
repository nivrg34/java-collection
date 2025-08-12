// Program to demonstrate function overriding in Java
// File: FunctionOverriding.java

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overrides the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calls Animal's sound()

        Dog d = new Dog();
        d.sound(); // Calls Dog's overridden sound()

        // Polymorphism
        Animal ref = new Dog();
        ref.sound(); // Calls Dog's overridden sound() due to dynamic binding
    }
}
