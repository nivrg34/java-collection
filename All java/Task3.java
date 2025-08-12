/*
 * Create  a class Math which has a function add() to perform sum of tow numbers using user input and display result. Derive a class addition which has a function add() to perform sum of three numbers using and display result
 */
import java.util.Scanner;

class Math{
    
       int sum;
    void add(){
        int a,b;    
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = s.nextInt();
        System.out.println("Enter second number:");
        b = s.nextInt();
        sum = a + b;
        System.out.println("Sum is: " + sum);

    }
}

class Addition extends Math{
    void add() {
        super.add(); // Call parent add() to add two numbers

        Scanner s = new Scanner(System.in);
        System.out.print("Enter third number: ");
        int c = s.nextInt();

        sum = sum + c; // Add third number to parent's result
        System.out.println("Total sum of three numbers : " + sum);
    }
}



public class Task3 {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(); // Call the overridden add() method in Addition class
    }
    
}
