package Abstraction;

public class Main {
    public static void main(String[] args) {
        Car garrett = new Car(23, "east", 2, 378);
        Truck kevin = new Truck(12,500,293, "west");
        System.out.println(kevin.honk());
        System.out.println(garrett.honk());
        kevin.towCar(garrett);
        System.out.println(kevin.toString());
        System.out.println(garrett.toString());

    }

}
