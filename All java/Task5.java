

/*
 *create a class student having id, name, program as field , with a default constructor and two setter named with setstudent, one setter have two parameter to set id and name . Another setter have 3 parameter id, name and program. also create a display method to display all info use the concept of method overloading
 */


class students{
 int id;
 String name;
 String program;

  students(){  //!default constructor
    id = 0;
    name = null;
    program = null;
 }

  void SetStudent(int id, String name){   //^Two constructor 
   this.id = id;
   this.name = name;
 }

 void SetStudent(int id, String name, String program){ //^three constructor
      this.id = id;
      this.name = name;
      this.program = program;

   }

   void display(){   //*Display function
      System.out.println("Id : "+ id);
      System.out.println("Name : "+name);
      System.out.println("Program : "+ program);
   }
 }

public class Task5 {
    public static void main(String[] args){
      students s = new students();
      s.SetStudent(12,"karan");
      s.display();
      s.SetStudent(12,"januka","Java");
      s.display();
    

    }
}
