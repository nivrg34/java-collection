/*Create a class Person which has three data members name, age and address. Create setter and getter methods to set and get given data members. Derive a class Student from Person class, which has a data member rollNo. Create setter and getter to set and get rollNo. Now, create an object in main method and set all the details of student. Except, set rollNo only if student's age is greater than or equals to 16. Also, display all the details of Student. */

class Person{
    private String name;
    private int roll_No;
    private String address;
    void setName(String name){ this.name = name;}
    void setRoll_No(int roll_No){ this.roll_No = roll_No;}
    void setAddress(String address){this.address = address;}
    String getName(){return name;}
    int getRoll_No(){return roll_No;}
    String getAddress(){return address;}
    }

class Student extends Person{
    private int age;
    void setAge(int age){
        if(age >= 16) {
            this.age = age;
            // Assuming roll_No is set to age for demonstration
        } 
    }
    int getAge(){
        return age;
    }
    void display(){
        System.out.println("Name  : " + getName());
        System.out.println("Roll : " + getRoll_No());
        System.out.println("Age : " + (getAge() >= 16 ? getAge() : "Not eligible for roll number"));
        System.out.println("Address : " +getAddress());

    }
}

public class task10 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("karan");
        s1.setRoll_No(6);
        s1.setAddress("Lx");
        s1.setAge(12);
        s1.display();

    }
}
