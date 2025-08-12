/*
 * Create a class person, which has two attributes: name and age. Create getter and setter methods for each attribute.
 * create a derived class students, which has one attribute roll_no. Create  setter for that attribute and a which has one attribute  salary
 * . Create setter for that class teacher
  */


  class Person{
    private String name;
    private int age;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
  }

//   class Students extends Person{
    // private int roll_no;
    // void SetRoll_No(int roll_No){
    //     this.roll_no = roll_no;
    // }
    // int getRoll_No(){
    //     return roll_no;
    // }
      class Students extends Person{
    private int roll_no;
    void SetRoll_No(int roll_no){
        this.roll_no = roll_no;
    }
    int getRoll_No(){
        return roll_no;
    }
    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : " + getAge());
        System.out.println("Roll No : " + roll_no);
    }
  }
  class Teacher extends Person{
    private double salary;
    void setSalary(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }
    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : " + getAge());
        System.out.println("Salary : " + salary);
    }

  }

public class run {
    public static void main(String[] args){
        Students s =  new Students();
        Teacher t = new Teacher();
        s.setName("Karan");
        s.setAge(18);
        s.SetRoll_No(12);
        t.setName("Ravi");
        t.setAge(30);
        t.setSalary(50000);
        s.display();
        t.display();
    }
    
    
}
