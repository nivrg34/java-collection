//*Hybrid Inheritance Example in Java


interface Animal{
    void eat();
}

class Mammal implements Animal{
    @Override
    public void eat() {
        System.out.println("THis mammal eats food.");
    }
}

interface Pet{
    void play();
}


public class Dog extends Mammal implements Pet{
    @Override
    public void play(){
        System.out.println("Dog is playful.");
    }
    public void bark() {
        System.out.println("Dog bark.");
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat(); // From Mammal
        dog.play(); // From Pet
        dog.bark(); // From Dog
    }
}

