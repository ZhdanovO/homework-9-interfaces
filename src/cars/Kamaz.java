package cars;

import beepers.Beeper;
import cabinSizes.CabinSize;
import engines.Engine;
import gearBoxes.GearBox;

public class Kamaz extends Car{
    public Kamaz(Beeper beeper, Engine engine, CabinSize cabinSize, GearBox gearBox) {
        super(beeper, engine, cabinSize, gearBox);
    }

    public String getLoadCapasity(){
        return "5000 kilograms";
    }
}
