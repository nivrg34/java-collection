interface Animal{
    //^abstract method
    void makeSound();
        //default method
        default void eat(){
            System.out.println("This animal is eating");
        }
        //static method
        static void sleep(){
            System.out.println("this animal is sleeping");
        }
    
}

class Mydog implements Animal{
    //implementing the abstract method
     @Override
    public void makeSound(){
        System.out.println("MOOF");
    }
}



public class TestIntefrace {
    //implementing the abstract method
   
    public static void main(String[] args) {
        Mydog d = new Mydog();
        d.makeSound();
        d.eat();
        //~calling static method
        Animal.sleep();
        

    }
    
}
