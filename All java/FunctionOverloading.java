// Program to demonstrate function overloading in Java
// File: FunctionOverloading.java

public class FunctionOverloading {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();
        System.out.println("Sum of 2 and 3: " + obj.add(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + obj.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + obj.add(2.5, 3.5));
    }
}
