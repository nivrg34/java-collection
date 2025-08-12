//*Super keyword to invoke parent constructor */

class parent{

    public parent() {
        System.out.println("Parent class default constructor. ");
    }
    parent(String message) {
        System.out.println("Parent class constructor with message :" + message);
    }
}

class child extends parent{

    public child() {
        super(); // Invokes parent class default constructor
        System.out.println("Child class default constructor.");
    }
    child(String message){
        super(message); // Invokes parent class constructor with message
        System.out.println("Child class constructor with message: " + message);
    }
    
}




public class Superc {
    public static void main(String[] args){
            child c1 = new child(); // Calls default constructor
            System.out.println();
            child c2 = new child("Hello from child!"); // Calls constructor with message
            System.out.println();
    }
    
}
