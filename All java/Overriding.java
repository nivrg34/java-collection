class Animal{
    //Method to be overridden
    public void sound(){
    System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    // Overriding the sound method
    @Override
    public void sound(){
    System.out.println("Dog barks");
    }
}




public class Overriding {
    public static void main(String[] args){
        Animal myanimal = new Animal();  //Animal reference and object
        Animal mydog = new Dog();  // Animal reference but Dog object

        myanimal.sound(); // Calls the method in Animal class
        mydog.sound();    // Calls the overridden method in Dog class
    }
       
    }   


