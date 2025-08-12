



public  abstract class AbstractAnimal {
    private String name;
    
    //constructor
    public AbstractAnimal(String name) {
        this.name = name;
    }
    // getter for name
    public String getName() {
        return name;
    }
    // abstract method to be implemented by subclasses
    public abstract void makeSound();
  
}

class snake extends AbstractAnimal{
 
    public snake(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(" hisses");
    }
    public static void main(String[] args) {
        snake s = new snake("Python");
        s.makeSound();
        
    }

}