
// purpose: Demonstrating the use of super keyword in Java

class Parent{
    String name = "AbdelRahman";

    void display() {
        System.out.println("Parent class display method.");
    }
}

class child extends Parent{
    String name;

    void display() {
        System.out.println("Child class display method.");
    }

    void show(){
        System.out.println("Name from child class " + name);
        System.out.println("Name from parent class " + super.name);
        display(); // *Calls child class display method
        super.display(); //* */ Calls parent class display method
    }
}






public class SuperClass {
    public static void main(String[] args) {
       child c = new child();
       c.name = "Eman";
      
         c.show();
}
}
