package Composition;
import Abstraction.Billable;

import java.util.ArrayList;

public class Table implements Billable {

    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs) {
        for(int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }

    }
    // Overridden constructor allows user to give number of legs
    // and set leg length, table width, table length
    public Table(Integer numLegs, Integer legLength, Integer width, Integer length){
        this.width = width;
        this.length = length;
        for (int i = 0; i < numLegs; i++){
            legs.add(new Leg(legLength));
        }
    }

    // Abstract method
    @Override
    public Float getPrice() {
        return (float) (width * length * 1.00);
    }
}
