package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Suero", (byte) 25, (Integer) 123456789, (Integer) 1000000000);
        System.out.println(john.speak());
    }
}
