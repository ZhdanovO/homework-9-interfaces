package cars;

import beepers.Beeper;
import engines.Engine;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;

    public Car(Beeper beeper, Engine engine) {
        this.beeper = beeper;
        this.engine = engine;
    }
}
