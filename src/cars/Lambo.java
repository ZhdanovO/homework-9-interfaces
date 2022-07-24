package cars;

import beepers.Beeper;
import cabinSizes.CabinSize;
import engines.Engine;
import gearBoxes.GearBox;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine, CabinSize cabinSize, GearBox gearBox) {

        super(beeper, engine, cabinSize, gearBox);
    }

    public String getCost() {
        return "999999$";
    }

}
