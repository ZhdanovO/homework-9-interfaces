package cars;

import beepers.Beeper;
import cabinSizes.CabinSize;
import engines.Engine;
import gearBoxes.GearBox;

public class Nefaz extends Car{
    public Nefaz(Beeper beeper, Engine engine, CabinSize cabinSize, GearBox gearBox) {
        super(beeper, engine, cabinSize, gearBox);
    }

    public String getWorkPermit () {
        return "Разрешение на работу есть";
    }
}
