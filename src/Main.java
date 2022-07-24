import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import cabinSizes.BigCabin;
import cabinSizes.CabinSize;
import cabinSizes.LittleCabin;
import cabinSizes.NormalCabin;
import cars.*;
import engines.Engine;
import engines.EngineV12;
import engines.EngineV6;
import engines.EngineV8Turbo;
import gearBoxes.BigTransportGearBox;
import gearBoxes.GearBox;
import gearBoxes.RegularGearBox;
import gearBoxes.SportGearBox;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        CabinSize littleCabin = new LittleCabin();
        GearBox sportGearBox = new SportGearBox();
        Lambo lambo = new Lambo(horn, engineV12, littleCabin, sportGearBox);

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        CabinSize normalCabin = new NormalCabin();
        GearBox regularGearBox = new RegularGearBox();
        Priora priora = new Priora(magicSound, engineV6, normalCabin, regularGearBox);

        CabinSize bigCabin = new BigCabin();
        GearBox bigTransportGearBox = new BigTransportGearBox();
        Engine engineV8turbo = new EngineV8Turbo();
        Nefaz nefaz = new Nefaz(horn, engineV8turbo, bigCabin, bigTransportGearBox);

        Kamaz kamaz = new Kamaz(magicSound, engineV8turbo, littleCabin, bigTransportGearBox);

        //вызов частных методов
        System.out.println(lambo.getCost());
        System.out.println(priora.downShifting());
        System.out.println(nefaz.getWorkPermit());
        System.out.println(kamaz.getLoadCapasity());

        System.out.println();

        //вызов общих методов
        ArrayList<Car> transporter = new ArrayList<>();
        transporter.add(lambo);
        transporter.add(priora);
        transporter.add(nefaz);
        transporter.add(kamaz);

        transporter.forEach((Car car) -> {
            System.out.println(car.getClass());
            System.out.println(car.beeper.makeSound());
            System.out.println(car.engine.getSpeed());
            System.out.println(car.cabinSize.getCapasity());
        });
    }
}