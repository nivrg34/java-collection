/*
 *Create a class book, which has two fields name, author. create getter and setter for each fields . Derive a class PrintedBook.
*which has a field size. create setter for this field and a display function to display all it's information . Again derive
 *a class EBook, which has a field size, create a setter for this field and a display function to display it's information CLASS
 */



class Book {
    private String name;
    private String author;

    void setName(String name){
        this.name = name;
    }
    void setAuthor(String author){
        this.author = author;
    }

    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
}

class PrintedBook extends Book{
    private double size;
    void setSize(double size){
        this.size = size;
    }
    double getSize(){
        return size;
    }
   
    void display(){
        System.out.println("Name: "+getName());
        System.out.println("Author:"+ getAuthor());
        System.out.println("Size: "+getSize());
    }
}

class EBook extends Book{
    private double size;
    void setSize(double size){
        this.size = size;
    }
    
    void display(){
        System.out.println("Name: "+getName());
        System.out.println("Author:"+ getAuthor());
        System.out.println("Size: "+size);
    }
}

public class Library{
    public static void main(String[] args) {
        PrintedBook p = new PrintedBook();
        p.setName("The end times");
        p.setAuthor("ST. John");
        p.setSize(500.0);

        EBook e = new EBook();
        e.setName("The beginning");
        e.setAuthor("ST. mark");
        e.setSize(300.0);

        p.display();
        e.display();
    }
}



