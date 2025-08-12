//multiple consturctors
// File: task11.java


class demo{
    demo(){
        System.out.println("Default constructor");
    }
    demo(int a){
        System.out.println("Parameterized constructor with value: " + a);
    }
}



public class task11 {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo obj2 = new demo(5);
    }
}
