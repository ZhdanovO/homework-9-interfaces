package cars;

import beepers.Beeper;
import cabinSizes.CabinSize;
import engines.Engine;
import gearBoxes.GearBox;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;
    public CabinSize cabinSize;
    public GearBox gearBox;

    public Car(Beeper beeper, Engine engine, CabinSize cabinSize, GearBox gearBox) {
        this.beeper = beeper;
        this.engine = engine;
        this.cabinSize = cabinSize;
        this.gearBox = gearBox;
    }
}
