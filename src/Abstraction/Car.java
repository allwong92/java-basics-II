package Abstraction;

public class Car extends Vehicle {

    private int speed;
    private String direction;
    private int numWheelDrive;

    private int weight;

    // Constructor
    public Car(int speed, String direction, int numWheelDrive, int weight) {
        this.speed = speed;
        this.direction = direction;
        this.numWheelDrive = numWheelDrive;
        this.weight = weight;
    }

    // Getters
    public String getDirection() {
        return direction;
    }

    public int getNumWheelDrive() {
        return numWheelDrive;
    }

    public int getWeight(){
        return weight;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    // Abstract methods

    @Override
    int hitGas() {
        return speed + 5;
    }
    @Override
    public String honk(){
        return "Beep-beep!";
    }

    @Override
    public void turn() {
        if (direction.equals("east")){
            direction = "south";
        }
        if (direction.equals("south")){
            direction = "west";
        }
        if (direction.equals("west")){
            direction = "north";
        }
        if (direction.equals("north")){
            direction = "east";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", direction='" + direction + '\'' +
                ", numWheelDrive=" + numWheelDrive +
                ", weight=" + weight +
                '}';
    }
}
