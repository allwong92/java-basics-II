package Abstraction;

public class Truck extends Vehicle{

    private int speed;
    private int towPower;
    private int weight;
    private String direction;

    // Constructor
    public Truck(int speed, int towPower, int weight, String direction) {
        this.speed = speed;
        this.towPower = towPower;
        this.weight = weight;
        this.direction = direction;
    }
    // Abstract Methods

    @Override
    int hitGas() {
        return speed + 3;
    }

    // Abstract methods
    @Override
    public String honk() {
        return "ERRRRR!!!";
    }

    @Override
    public void turn() {
        if (direction.equals("east")){
            direction = "north";
        }
        if (direction.equals("south")){
            direction = "east";
        }
        if (direction.equals("west")){
            direction = "south";
        }
        if (direction.equals("north")){
            direction = "west";
        }
    }

    // Methods

    public void towCar(Car c){
        /*
        This method determines if the given car can be towed and prints a message.
         */
        if (c.getWeight() <= towPower){
            System.out.println("You are towing this car!");
        } else{
            System.out.println("You can't tow this car... *insert sad car noises*");
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                ", towPower=" + towPower +
                ", weight=" + weight +
                ", direction='" + direction + '\'' +
                '}';
    }
}
