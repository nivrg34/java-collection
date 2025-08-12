

public class TostringFun {
    int roll_no;

    public TostringFun(int roll_no) {
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        //
        TostringFun obj = new TostringFun(1);
        TostringFun obj1 = new TostringFun(2);
        String str = obj.toString();
        
        

        System.out.println("obj");
        System.out.println("T");
        System.out.println(obj.hashCode());

        System.out.println("Are they equal : "+obj.equals(obj));
        System.out.println("Are they equal : "+obj.equals(obj1));
    }

    

}

