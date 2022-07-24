package cars;

import beepers.Beeper;
import cabinSizes.CabinSize;
import engines.Engine;
import gearBoxes.GearBox;

public class Priora extends Car {
    public Priora(Beeper beeper, Engine engine, CabinSize cabinSize, GearBox gearBox) {

        super(beeper, engine, cabinSize, gearBox);
    }

    public String downShifting () {
        return "Занижена";
    }
}
