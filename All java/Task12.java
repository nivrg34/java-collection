
import java.util.Scanner;

//WAP in java to check string is palindrome or not using string buffer class with user input




public class Task12 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sn.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb.toString())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        
         System.out.println("Normal String" + str);
         System.out.println("Reversed String" + sb);
      
    }
}
