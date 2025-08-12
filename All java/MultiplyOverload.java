class multiply{
    //method to multiply two integer
    public int multi(int a, int b){
        return a*b;
    }

    //overload method to multiply three  integers
    public int multi(int a, int b, int c){
        return a*b*c;
    }

    //overload method to multiply a double and an integer
    public double multi(double a,int b){
        return  a*b;
    }
}



public class MultiplyOverload {
    public static void main(String[] args) {
        
        multiply  m = new multiply();
        System.out.println("multiplication of two integers : " + m.multi(2,5));
        System.out.println("Multiplication of three integers : " + m.multi(2,5,6));
        System.out.println("Multiplication of double and integer : " + m.multi(2.5,5));


    }
    
}
