package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var marshMadness = new ArrayList<Marshmallow>();
        JumboMarshmallow m1 = new JumboMarshmallow();
        MiniMarshmallow m2 = new MiniMarshmallow();
        Peep chick = new Peep();
        Rainbow rainbow = new Rainbow();
        Wumbo w = new Wumbo();

        marshMadness.add(m1);
        marshMadness.add(m2);
        marshMadness.add(chick);
        marshMadness.add(rainbow);
        marshMadness.add(w);

        for (Marshmallow mallow: marshMadness) {
            System.out.println(mallow.speech());
        }


    }
}
