// Program to concatenate two strings using String and StringBuffer
// File: ConcatStrings.java

public class ConcatStrings {
    public static void main(String[] args) {
        // Concatenation using String
        String str1 = "Hello, ";
        String str2 = "World!";
        String result1 = str1 + str2;
        System.out.println("Concatenation using String: " + result1);

        // Concatenation using StringBuffer
        StringBuffer sb = new StringBuffer("Hello, ");
        sb.append("World!");
        System.out.println("Concatenation using StringBuffer: " + sb.toString());
    }
}
