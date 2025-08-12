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
        return  age;
    }
}

class Students extends Person{
    private int roll_No;
    void SetRoll_No(int roll_No){
        this.roll_No = roll_No;
    }
    int getRoll_No(){
        return  roll_No;
    }
}
class BITStudents extends Students{
    private  String ProjectTitle;
    void SetTitle(String title){
       ProjectTitle = title;
        }
        String getTitle(){
        return  ProjectTitle;
        }
}




public class Test {
    public static void main(String[] args){
        BITStudents s =  new BITStudents();
        s.setName("karan");
        s.setAge(12);
        s.SetRoll_No(12);
       s.SetTitle("Hello");
        System.out.println("Name : "+s.getName());
        System.out.println("Age : " + s.getAge());
        System.out.println("Roll no : "+ s.getRoll_No());
        System.out.println("Title : "+s.getTitle());
    }
}
