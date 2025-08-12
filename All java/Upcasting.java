class Human{  //^Parent class

    void country(){ //*Secondary call */
        System.out.println("I live in Nepal");
    }
}

class Karan extends Human{   //!Child class

    void country(){  //*Primary call */
        System.out.println("I live in belbari-11,laxmimarga");  
    }

    void age(){
        System.out.println("MY age is 19");
    }
}









public class Upcasting {
    public static void main(String[] args) {
      Karan k = new Karan();  //!Creating child class object
      Human h = k; //~References child class properties to parents class
      h.country();  //^calls child class  country function from the parents class 
        //*Basically in this code the child class refrence is pass to the parents */
    }
    
}
