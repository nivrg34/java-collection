/*
*Create a class with a field watt. Create a parameterized constructor to initialize watt and  a display function to print watts.
*Derive  Class CFL which has a field watts and price. Create a parameterized constructor to initialize both fields, also use super keyword to call parent class constructor . create a function display to print to print all the information of CFL and call display function using Super keyword */



class power{
  private int watt;
    power(int watt){
        this.watt = watt;
    }
    
     void display(){
        System.out.println("Wattage: " + watt + "W");
    }
}

class CFL extends power{
    private int price;
    CFL(int watt, int price){
        super(watt);
        this.price = price;
    }
     
    void display(){
        super.display();
        System.out.println("Price: " + price);
    }

}


public class Bulb {
    public static void main(String[] args){
        CFL c = new CFL(20,200);
        c.display();
    }
}
