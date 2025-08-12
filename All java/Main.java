import java.util.Scanner;

class Container{
    private int num1;
    private int num2;
    void setNum1(int num1){
        this.num1 = num1;
    }
    void SetNum2(int num2){
        this.num2 = num2;
    }
    int getNum1(){
        return num1;
    }
    int getNum2(){
        return num2;
    }
}
class sum extends Container {
    int add(){
        return getNum2()+getNum1();
    }
  

}



public class Main {
    public static void main(String[] args){
        int n1,n2;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        n1 = sn.nextInt();
        System.out.println("Enter the second number : ");
        n2 = sn.nextInt();
       
       sum s1 = new sum();
        s1.setNum1(n1);
        s1.SetNum2(n2);
        System.out.println("The sum is "+s1.add());



    }

}
