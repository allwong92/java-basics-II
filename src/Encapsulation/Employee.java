package Encapsulation;

public class Employee extends Person{
    // Instance variables
    private int salary;

    Employee(String firstName, String lastName, Byte age, Integer ssn, Integer salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    // Methods
    public String speak(){
        return "Hi! My name is " + this.getFirstName() + " " + this.getLastName()
                + " and I make " + salary + " per year!";
    }
}
