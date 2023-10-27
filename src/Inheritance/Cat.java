package Inheritance;
public class Cat {

    // Data...
    private String name;

    // Constructors...
    public Cat(String name){
        this.name = name;
    }

    // Methods...
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}