import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import cars.Car;
import cars.Lambo;
import cars.Priora;
import engines.Engine;
import engines.EngineV12;
import engines.EngineV6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();

        Lambo lambo = new Lambo(horn, engineV12);

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();

        Priora priora = new Priora(magicSound, engineV6);


        ArrayList<Car> transporter = new ArrayList<>();
        transporter.add(lambo);
        transporter.add(priora);

        transporter.forEach((Car car) -> {
            System.out.println(car.beeper.makeSound());
            System.out.println(car.engine.getSpeed());
        });
    }
}