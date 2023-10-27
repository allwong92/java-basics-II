package Composition;

public class Main {
    public static void main(String[] args) {
        var myTable = new Table(4);
        var anotherTable = new Table(6, 3, 30, 25);
        var  billedTable = new Table(4, 2, 10, 10);
        System.out.println("The price of your table is: $" + billedTable.getPrice());
    }
}
